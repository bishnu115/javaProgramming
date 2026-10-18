package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class compareList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 20);
        List<Integer> list2 = Arrays.asList(20, 30, 10, 20);

        List<Integer> copy1 = new ArrayList<>(list1);
        List<Integer> copy2 = new ArrayList<>(list2);

        Collections.sort(copy1);
        Collections.sort(copy2);

        if (copy1.equals(copy2)) {
            System.out.println("Lists are equal");
        } else {
            System.out.println("Lists are not equal");
        }


    }
}
