package Collection;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();// không có thứ tự
        //   key -> value
        //    {
        //        "id": "Mạnh",
        //        "phone_number": "0559517003"
        //    }
        // key -> value
        // Thêm phần tử vào Map
        myMap.put("id", 1);
        myMap.put("name", 2);
        myMap.put("age", 22);

        // xoá phàn tử khỏi map
//        myMap.remove("id");// key

        boolean exitsKey =  myMap.containsKey("id"); // dùng khi muốn check xem trong map có tồn tại key đó không
        boolean exitesValue =  myMap.containsValue(5);// dùng khi muốn check xem trong map có tồn tại giá trị đó ko

        System.out.println(exitsKey);
        System.out.println(exitesValue);
        // In map

        System.out.println(myMap);

//        for (Map.Entry<String, Integer>  entry : myMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }
}
