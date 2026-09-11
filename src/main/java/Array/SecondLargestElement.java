package Array;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        m1();
        m2();


    }

    public static void m1() {
        int[] arr = {18, 2, 3, 5};

        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                smax = max;
                max = num;
            } else if (num > smax) {
                smax = num;
            }
        }
        System.out.println(smax);
    }


    public static void m2() {

        int[] arr = {10, 20, 40, 30, 50};

        Arrays.sort(arr);

        System.out.println("Second Largest: " + arr[arr.length - 2]);
    }
}


