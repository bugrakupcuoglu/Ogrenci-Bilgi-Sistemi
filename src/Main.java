// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alan Turing","MAT","555");
        Teacher t2 = new Teacher("Albert Einstein","FZK","534");
        Teacher t3 = new Teacher("Prof. Dr. Abuzer Kömürcü", "KIM","666");

        Course c1 = new Course("Matematik","MAT","101");
        c1.addTeacher(t1);
        Course c2 = new Course("Fizik","FZK","101");
        c2.addTeacher(t2);
        Course c3 = new Course("Kimya","KIM","101");
        c3.addTeacher(t3);

        Student s1 = new Student("Ali","132","4",c1,c2,c3);
        s1.addBulkExamNote(20,70,50,50,70,90);
        s1.calcExamAvarage();
        s1.calcTeacherNoteAvarage();
        s1.calcOverallAvarage();
        s1.isPass();
        System.out.println("----------------------");
        Student s2 = new Student("Veli","133","4",c1,c2,c3);
        s2.addBulkExamNote(55,62,57,20,20,20);
        s2.calcExamAvarage();
        s2.calcTeacherNoteAvarage();
        s2.calcOverallAvarage();
        s2.isPass();
        System.out.println("----------------------");
        Student s3 = new Student("Erdal","131","4",c1,c2,c3);
        s3.addBulkExamNote(50,30,100,0,20,95);
        s3.calcExamAvarage();
        s3.calcTeacherNoteAvarage();
        s3.calcOverallAvarage();
        s3.isPass();



    }

}