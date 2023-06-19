public class Teacher {
    String name;
    String branch;
    String mpNo;

    Teacher(String name,String branch,String mpNo){
        this.name = name;
        this.branch = branch;
        this.mpNo = mpNo;
    }

    void print(){
        System.out.println("Öğretmenin Adı : " + this.name);
        System.out.println("Öğretmenin Bölümü : " + this.branch);
        System.out.println("İletişim No : " + this.mpNo);

    }


}
