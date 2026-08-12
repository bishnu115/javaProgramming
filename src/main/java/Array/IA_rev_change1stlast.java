package Array;

import java.util.Arrays;
import java.util.Collections;

public class IA_rev_change1stlast {

    public static void main(String[] args) {
        buildin();
        m1();
    }

    public static void buildin() {
        // collection is work with integer not int bcz integer is object and collection work with object
        Integer[] arr = {24, 24, 55, 78, 9, 999, 3};
        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Before Swap : " + Arrays.toString(arr));
        // Swap first and last element
        Integer temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("After Swap  : " + Arrays.toString(arr));
    }

    public static void m1() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");
        }
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("\n rev");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void m2() {
        int[] arr = {1, 2, 3, 4, 5};
        // Step 1: Reverse the array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("After Reverse: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Step 2: Swap first and last elements
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.print("\nAfter Swapping First and Last: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}


