package inheritance;

import accessModifier.Person;

import java.sql.SQLOutput;

public class Student extends Person {
    private Integer msv;

    public Student() {
        // Hàm tạo mặc định

    }

    public Student(Integer msv, String username, Integer age, String address, String job) {
        super(username, age, address, job); // Mặc định cho lên trên đầu tiên
        System.out.println("Vào Hàm tạo của Student");
        // Person person = new Person();
        this.msv = msv;
    }

    public Integer getMsv() {
        return msv;
    }

    public void setMsv(Integer msv) {
        this.msv = msv;
    }

//    @Override
//    public String toString() {
//        //super thàng cha Person
//        return this.msv + " " + super.toString();
//    }


    public static void main(String[] args) {
        Student student = new Student(20210794,"Nguyễn Xuân Mạnh", 22, "Hà Nội", "Developper" );
        System.out.println(student.getMsv());
        System.out.println(student.getUsername());
        System.out.println(student.getAge());
        System.out.println(student.getJob());
        System.out.println(student.getAddress());

//        System.out.println(student); // Gọi toString
        // 0X32213

    }
}
