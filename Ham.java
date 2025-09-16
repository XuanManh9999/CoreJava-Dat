public class Ham {
    // Hàm trả về giá trị
    static int sum (int a, int b) {
        return a + b;
    }




    // Hàm không trả về giá trị

    static void developer() {
        System.out.println("eat");
        System.out.println("sleep");
        System.out.println("code");
    }

    public static void main(String[] args) {

        // Hàm trong Java gồm 2 loại chính
        // Hàm có trả về giá trị
        // Hàm không trả về giá trị
        // Lưu ý: khi gặp câu lệnh return thì các câu lệnh bên dưới sẽ không được thực ti nữa. Và dùng return để trả về giá trị của hàm
        // Hàm khi định ngĩa thì nó gồm có tham số. Khi gọi truyền giá trị vào gọi là đối số
        // Ưu điểm của hàm: giúp chia tách code, giúp code dễ bảo trì
        // Định ngĩa hàm

        // int (kiểu dữ liệu trả về) ten_ham(viết thường chữ cái đầu) (các tham số) {
        //          // code trong hàm
        // }

        // Cách gọi hàm (ta dùng tên hàm để gọi hàm)
        // sum (đối số)

        int a = 12;
        int b = 12;


        int kq = sum (a, b);
        System.out.println(kq);

        System.out.println(luy_thua(2, 3));


        developer();
        // int, float, double, short, Strong boole
    }
    static int luy_thua (int n, int so_mu) {
        // 2 ^ 3 = 2 * 2 * 2
        int res = 1;

        for (int i = 0; i < so_mu; i++) {
            res *= n;
        }
        return res;
    }
}
