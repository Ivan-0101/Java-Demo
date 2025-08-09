package Exercise_3_Package;

import java.util.Arrays;
import java.util.List;

public class Reverse_List {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("The reversed list is:");

        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.println(list1.get(i));
        }
    }
}
