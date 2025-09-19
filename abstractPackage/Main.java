package abstractPackage;

public class Main {
    public static void main(String[] args) {
        // không thể khởi tạo đối tượng từ Abstract class nhưng có thể dùng nó làm khuôn mẫu

        Dat dat = new Dat();
        dat.eat();
        dat.sleep();
        dat.code();
    }
}
