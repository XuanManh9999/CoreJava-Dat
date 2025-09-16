//import accessModifier.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    void sleep() {
        int a = 1;
        System.out.println("NGU");
    }
    public static void main(String[] args) {
//        # Cú pháp cơ bản
//        +, kiểu dữ liệu (int, float, double, string)
//        +, biến, hằng số, phạm vi biến
//        +, toán tử số học, logic, gán
        // Số nguyên (int, Integer), số thực, chuỗi, True, False

//        System.out.println("Giá trị của a là: " + a + " Giá trị của b là: " + b);
//        System.out.println(b);
        // 1 byte ~ 8 bit
        // một bit
//        int a = 1; // tạo bằng kiểu nguyên thuỷ |  2-4 (byte)
//        Integer b = 1; // Tạo bằng đối tượng | 2-4 (byte)
//        float c = 1.2F; // với kiểu dữ liệu float thì cần thêm hậu tố f hoac F đằng sau | 4 (byte)
//        double d = 1.2; // | 8 (byte)
//        char e = 'D';// | 1 (byte)
//        String f = "Nguyễn Xuân Mạnh";//  | 2 (byte)
//        boolean g = true;//  | 1 (byte)
//        boolean h = false;//  | 1 (byte)

        // hằng số trong Java khi khai báo ta cần khởi tạo giá trị ngay, và khi khởi tạo giá trị thì không thể gán lại được
        // final
//        final String  dat = "Dat IT9";
//        System.out.println(dat);

        // Phạm vi của biến thì khi em khai báo ở trong hàm thì ta chỉ có thể sử dụng trong phạm vi của phương thức thôi
//        System.out.println(a);

        // Toán tử
        // Toán tử số học: +, -, *, /, %
        // Toán tử logic: && (and), ||(or), ! (not)
        // Toán tử đúng sai: true, false
//
//        int a = 1;
//        int b = 2;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
//
//  # Cú pháp điều khiển
//        +, if-else, switch-case

//        int a = 1999;
//        int sl = 0;
//
//        if (a >= 2000) {
//            System.out.println("DU TIEN");
//            if (sl > 0) {
//                System.out.println("MUA THANH CONG");
//            }else {
//                System.out.println("SAN PHAM HET HANG");
//            }
//        }else if (a >= 10000) {
//            System.out.println("SO DU KHONG HOP LE");
//        }
//        else {
//            System.out.println("Khong du tien");
//        }
//        Lệnh switch-case
//
//        int thang = 2;
//        switch (thang) {
//            case 1, 3, 5, 7, 8, 10, 12:
//                System.out.println("Có 31 ngày");
//                break;
//            case 2:
//                System.out.println("Có 28 ngày");
//                break;
//            case 4, 6, 9, 11:
//                System.out.println("Có 30 ngày");
//                break;
//            default:
//                System.out.println("Default");
//        }
    // Toán tử 3 ngôi
//     int a = 11;
//
//     if (a % 2 == 0) {
//         System.out.println("Số chẵn");
//     }else {
//         System.out.println("Số lẻ");
//     }
//    String result =   (a % 2 ==0) ? "Số chẵn" : "Số lẻ";
//        System.out.println(result);
//
        // Mảng (array)
//       int [] ten_mang_1 = {1, 2, 3, 4, 5, 6};
       // chỉ mục xuất phất từ 0
        // cách lấy độ dài của mảng ten_mang_1.length

//        System.out.println("Phần tử đầu: " + ten_mang_1[0]);
//        System.out.println("Độ dài của mảng: " + ten_mang_1.length);
//        System.out.println("Phần tử cuối mảng: " + ten_mang_1[ten_mang_1.length - 1]);
//# Vòng lặp
// # for (dùng khi biết trước số lần lặp), while, do-while (tự tìm hiểu), foreach (lặp đối tượng)


//        for (// giá trị khởi tạo (chỉ dùng 1 lần) ; điều kiện lặp; bước nhảy) {
//            // code
//        }
//        int [] ten_mang_1 = {1, 2, 3, 4, 5, 6};
//
//        for (int i = 0; i < ten_mang_1.length; i++) {
//            System.out.println(ten_mang_1[i]);
//        }
//
//        for (int i = 2; i <= 10; i++) {
//            System.out.println("Bảng: " + i);
//            for (int j = 0; j <= 10; j++) {
//                System.out.println(i + "*" + j + " = " + i * j );
//            }
//        }

//        int i = 1;
//        while (i  <= 100) {
//            System.out.println(i);
//            i++;
//        }
//
//        int so = 2;
//        int so_mu = 3;
//
//        int giai_thua = 1;
//        while (so_mu > 0) {
//            giai_thua *= so;
//            so_mu--;
//        }
//
//        System.out.println(giai_thua);
//
//        List<String> arr_list = new ArrayList<>();
//        arr_list.add("MẠNh");
//        arr_list.add("Đạt");
//        for (String user : arr_list) {
//            System.out.println(user);
//        }


        // Chuỗi, một số hàm phổ biến

//        String nam = "    Nguyễn Xuân Mạnh  ";
//        System.out.println(nam.charAt(0)); // Chỉ mục xuất phát từ 0 -> N - 1
//        System.out.println(nam.toUpperCase()); // in hoa hết
//        System.out.println(nam.toLowerCase()); // in thường hết
//        System.out.println(nam.split("")); // chuyển đổi chuỗi thành mảng theo regex trong ""
//        System.out.println(nam.contains("Xuân")); // Hàm kiểm tra xem chuỗi có tồn tại phần tử đó hay không, nếu có trả về True, không có trả về False
//        System.out.println(nam.indexOf("N"));// Trả về vị trị chỉ mục của phần tử N (sẽ lấy thằng đầu tiên nó tìm thấy)
//        System.out.println(nam.lastIndexOf("n"));// Trả về vị trị chỉ mục của phần tử N (sẽ lấy thằng đầu tiên nó tìm thấy)
//        System.out.println(nam.isEmpty());// Kiểm tra chuỗi có đang rỗng hay không
//        System.out.println(nam.trim()); // Loại bỏ khoảng cách đầu cuối
//        System.out.println(nam.);
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt(); Số nguyên
//        float age = sc.nextFloat();
//        System.out.println(age);
//        System.out.println("Nhập vào Họ: ");
//        String ho = sc.nextLine();
//        System.out.println("Nhập vào Tên: ");
//        String ten = sc.nextLine();
//
//        System.out.println(ho + ten + (ho.length() + ten.length()));


        // doi tuong khong co gi thi ra null
//        ViDu1 DoiTuong1 = new ViDu1();
//        DoiTuong1.setTen("Đạt");
//        System.out.println("Doi tuon 1: " + DoiTuong1.getTen() + DoiTuong1.getTuoi());
//
//        ViDu1 DoiTuong2 = new ViDu1("Tong Cong Minh");
//        System.out.println("Doi tuon 2: " + DoiTuong2.getTen() + DoiTuong2.getTuoi());

//        Person person = new Person();
    }
//# Nhập xuất cơ bản
//+, Scanner




}
