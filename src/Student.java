public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double examAvarage;
    double teacherNoteAvarage;
    double overallAvarage;

    boolean isPass;

    Student(String name,String stuNo,String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.examAvarage = 0.0;
        this.teacherNoteAvarage = 0.0;
        this.overallAvarage = 0.0;

        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3, int tnote1,int tnote2, int tnote3){
        if((note1 >= 0 && note1 <= 100) && (tnote1 >= 0 && tnote1 <= 100)){
            this.c1.note = note1;
            this.c1.teacherNote = tnote1;
        }
        if ((note2 >= 0 && note2 <= 100) && (tnote2 >= 0 && tnote2 <= 100)) {
            this.c2.note = note2;
            this.c2.teacherNote = tnote2;
        }
        if ((note3 >= 0 && note3 <= 100) && (tnote3 >= 0 && tnote3 <= 100)){
            this.c3.note = note3;
            this.c3.teacherNote = tnote3;
        }
    }

    void calcExamAvarage(){
        this.examAvarage = (this.c1.note + this.c2.note + this.c3.note)/3.0;
    }
    void calcTeacherNoteAvarage(){
        this.teacherNoteAvarage = (this.c1.teacherNote + this.c2.teacherNote + this.c3.teacherNote)/3.0;
    }
    void calcOverallAvarage(){
        this.overallAvarage= ((this.teacherNoteAvarage)*0.2 + (this.examAvarage)*0.8);
    }

    void isPass(){
        printNote();
        if (this.overallAvarage >= 55){
            this.isPass = true;
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
    void printNote(){
        System.out.println(this.name + " adlı öğrencinin " + this.c1.name + " notu : " + this.c1.note);
        System.out.println(this.name + " adlı öğrencinin " + this.c2.name + " notu : " + this.c2.note);
        System.out.println(this.name + " adlı öğrencinin " + this.c3.name + " notu : " + this.c3.note);
        System.out.println("Sınav ortalaması : " + this.examAvarage);
        System.out.println("Sözlü notu : " + this.teacherNoteAvarage);
        System.out.println("Genel ortalama : " + this.overallAvarage);
    }


}
