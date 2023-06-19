public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int note;
    int teacherNote;

    Course(String name, String prefix, String code){
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        int note = 0;
        int teacherNote = 0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacherInfo();
        }else {
            System.out.println("Öğretmen ile ders bilgileri uyuşmuyor");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}
