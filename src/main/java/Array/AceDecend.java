package Array;

import java.util.Arrays;
import java.util.Collections;

public class AceDecend {

    public static void main(String[] args) {
        nobuildin();
        m1();
        m2();


    }

    public static void nobuildin() {
        int[] arr = {53, 32, 8333, 31, 33339, 33};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nnobuild:");

        // Print sorted array
        for (int num : arr) {

            System.out.print(num + ",");
        }
    }

    public static void m1() {
        int[] arr = {5, 1, 4, 2, 8};
        Arrays.sort(arr);
        System.out.println("\nascended : " + Arrays.toString(arr));
        // Descending Order
        System.out.println("\nDescending Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void m2() {

        //  Note: This works only with Integer[], not int[].
        Integer[] arr = {5, 1, 4, 2, 8};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}


