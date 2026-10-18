package Array;

import java.util.HashSet;
import java.util.Set;

public class commomElement {
    public static void loop() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 7, 8, 9};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                    /*
                    Suppose arr2 contains duplicate values:
                        int[] arr1 = {3};
                        int[] arr2 = {3, 3, 3};
                        - Without break;: 3 prints three times.
                        - With break;: 3 prints only once for that element in arr1.
                     */
                }
            }
        }

    }
    public static void hashmap(){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println(num);
                set.remove(num);
            }
        }
    }

    public static void main(String[] args) {

        loop();
        hashmap();


    }
}
