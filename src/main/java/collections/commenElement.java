package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class commenElement {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 50, 30, 20));
        List<Integer> list2 = Arrays.asList(20, 30, 10, 60);

        list1.retainAll(list2);

        System.out.println(list1);
    }
}
