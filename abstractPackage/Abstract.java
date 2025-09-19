package abstractPackage;
// Abstract nó là một lớp trừu tượng, nó cũng có thể định nghĩa ra các phương thức, thuộc tính trừu tượng, nhưng nó cũng có thể có những phương thức
// và thuộc tính không trừu tượng, điểm đặc biệt là nó có tất cả tính chất như class thông thường
// không thể khởi tạo đối tượng từ Abstract class nhưng có thể dùng nó làm khuôn mẫu
public abstract class Abstract {
    private String username;// không
    public void sleep() {
        System.out.println("Tôi đang ngủ");
    }

    // Phương thức trừu tượng
    // Định nghĩa và chưa hề thực hiện
    // Thằng nào kế thừa nó sẽ cần impl nó

    public abstract void eat();


    // Phương thức trừu tượng
    public abstract void code ();
}
