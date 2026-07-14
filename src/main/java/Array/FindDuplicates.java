package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void m1(){

        int[] arr={1,3,4,5,4,3,2};

        Set<Integer>set=new HashSet<>();
        Set<Integer>duplicate=new HashSet<>();
        for(int num:arr){
            if (!set.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println("duplicate: "+duplicate);
    }
    public static void m2() {

        int[] arr={1,3,4,5,4,3,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print duplicates
        System.out.println("Duplicate Elements:");

        for (int q : map.keySet()) {
            if (map.get(q) > 1) {
                System.out.println(q + " -> " + map.get(q) + " times");

            }
        }
    }
    public static void main(String[] args) {

        m1();
m2();
    }
}

