package Array;

import java.util.Arrays;
import java.util.Collections;

public class IA_rev_change1stlast {

    public static void main(String[] args) {

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

}