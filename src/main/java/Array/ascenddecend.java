package Array;

import java.util.Arrays;
import java.util.Collections;

public class ascenddecend {

    public static void main(String[] args) {

        m2();

    }

    public static void m1() {
        int [] arr = {5, 1, 4, 2, 8};
        Arrays.sort(arr);
        System.out.println("ascended : " + Arrays.toString(arr));
        // Descending Order
        System.out.println("\nDescending Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void m2() {

      //  Note: This works only with Integer[], not int[].
        Integer [] arr = {5, 1, 4, 2, 8};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}


