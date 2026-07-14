package Array;

import java.util.HashMap;
import java.util.Map;

public class countDuplicate {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
//            }
//        }

        for (int q : map.keySet()) {
            if (map.get(q) > 1) {
                System.out.println(q + " -> " + map.get(q) + " times");

            }
        }
    }
}