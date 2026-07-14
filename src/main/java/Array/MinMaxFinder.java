package Array;

import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {

        m1();
        m2();
    }

    public static void m1() {
        int[] a = {5, 66, 777, 763, 7, 3};

        Arrays.sort(a);
        //find minmium
        System.out.println(Arrays.toString(a));
        System.out.println("small: "+a[0]);
        System.out.println("large :"+a[a.length - 1]);
    }

    public static void m2() {

        int[] numbers = {45, 12, 78, 4, 89, 33};

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
