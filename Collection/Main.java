package Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List nó là một Interface cha, cái ta dùng ở đây là ArrayList
        // Khai báo list
//        List <kiểu dữ liệu, object> ten_list = new ArrayList<>();
//        Integer []arr = {1, 2, 3, 4, 5, 6}; // cố định phần tử, không cung cấp các phương thức thêm, sửa, xoá phần tử trong nó
        List<Integer> numbers = new ArrayList<>();// không cố định, có cung cấp các phương thức thêm, sửa, xoá nó
        // Cách thêm 1 phần tử vào list
        numbers.add(1);// add vào cuối
        numbers.add(3);
        // cách xoá sẽ nhận vào index
//        Integer deleted =  numbers.remove(1);
//
//        System.out.println("Bạn vừa xoá phần tử: " + deleted);

        // Cách chèn vào
//        numbers.add(1, 2); // [1, 2, 3]
//        numbers.add(0, 5);// add vào đầu
//        numbers.add(numbers.size(), 22);// add về cuối

        // Tìm indexOf (value) trả về chỉ mục tìm tấy
        // Lưu ý nếu ta tìm phần tử mà không có trong list thì nó sẽ ném ra lỗi và dừng chương trình ngay
        //  Để khắc phục ta dùng contains trước


//
//        int find = numbers.indexOf(3); // nó trả về chỉ mục tìm thay
//        System.out.println(numbers.get(find));

        // contains (tồn tại) Nếu có phần tử trong list thì trả về true, không thi false
//        boolean tim = numbers.contains(3); //
//        System.out.println(tim);
//        Integer value = 3;
//        if (numbers.contains(value)) {
//            int find = numbers.indexOf(value); // nó trả về chỉ mục tìm thay
//            System.out.println(numbers.get(find));
//        }

//        int find = numbers.indexOf(4); // nó trả về chỉ mục tìm thay
//        System.out.println(numbers.get(find));

        // size() -> trả về số lượng phần tử
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));// dùng list.get(index);
//        }
//        for (int i = numbers.size() - 1; i >= 0; i--) {
//            System.out.println(numbers.get(i));
//        }


        // forEach

//        for (Integer value : numbers) {
//            System.out.println(value);// từng giá trị ở trong list
//        }
     }
}
