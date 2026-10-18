package Array;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        m1();
        m2();
    }

    public static void m1() {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
    public static void m2() {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};
        int[] mrg = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mrg, 0, arr1.length);
        System.arraycopy(arr2, 0, mrg, arr1.length, arr2.length);
        System.out.println(Arrays.toString(mrg));
    }
}

