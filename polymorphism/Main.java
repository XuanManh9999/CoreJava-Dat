package polymorphism;

import polymorphism.Student;

public class Main {

    // Overriding, Overloading -> Tính đa hình

    // Overloading -> phương thức sẽ ở nhiều hình dạng nhưng khác nhau về tham số, kiểu trả về và trùng tên, cùng nằm trong một lớp chung
    // Overriding -> khi kế thừa ghi đè phương thức, thuộc tính của thằng cha @Override

    public static void main(String[] args) {
//        Person person = new Person();
//        person.sleep();
//        person.sleep(12);
//        person.sleep("Mạnh");
        Student student = new Student();
        student.sleep();
//        student.sleep();
    }
}
