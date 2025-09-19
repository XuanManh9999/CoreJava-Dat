package Collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        // kiểu dữ liệu duy nhất, trong set các phần tử sẽ không được phép trùng nhau
        // VD [1, 2, 3 ,4 ,5 , 6, 6, 6] -> 1, 2, 3, 4, 5, 6
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(1);

        for (Integer value: set) {
            System.out.println(value);
        }
    }
}
