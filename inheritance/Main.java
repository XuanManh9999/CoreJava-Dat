package inheritance;

// Kế thừa giúp ta tái sử dụng code, làm cho code ngắn dễ bảo trì hơn
// Tích chất kế thừa là gì, thì hàm con sẽ kế thừa toàn bộ thuộc tính và phương thức của thằng cha ngoại trừ private
// Cú pháp kế thừa -> public class Student extends Person
// Kế thừa hàm tạo ta dùng từ khoá super -> thì super đại diện cho thàng cha được nó kế thừa
//public Student(Integer msv, String username, Integer age, String address, String job) {
//    super(username, age, address, job); // Mặc định cho lên trên đầu tiên
//    System.out.println("Vào Hàm tạo của Student");
//    // Person person = new Person();
//    this.msv = msv;
//}

// Một lớp có thể được nhiều lớp kế thừa



public class Main {
    public static void main(String[] args) {
        Student student = new Student(20210794,"Nguyễn Xuân Mạnh", 22, "Hà Nội", "Developper" );
        System.out.println(student.getMsv());
//        System.out.println(student.getUsername());
        System.out.println(student.getAge());
        System.out.println(student.getJob());
        System.out.println(student.getAddress());

//        System.out.println(student); // Gọi toString
        // 0X32213

    }
}