package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscDescMinMax {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(50, 20, 40, 10, 30);
        //asc
        Collections.sort(list);
        System.out.println(list);

        //desc
        Collections.sort(list,Collections.reverseOrder());
        int max=Collections.max(list);
        int min=Collections.min(list);

        System.out.println(list);
        System.out.println(max);
        System.out.println(min);
    }


}
