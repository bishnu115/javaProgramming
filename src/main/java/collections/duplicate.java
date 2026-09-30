package collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 22, 33, 44, 33, 11);
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> du = new LinkedHashSet<>();

        for (Integer num : list) {
            if (!set.add(num)) {
                du.add(num);
            }
        }
        System.out.println(du);

    }


}
