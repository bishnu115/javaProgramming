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
public void m3(){
    int[] arr1 = {1, 2, 3, 23, 55, 2, 55, 4};
    int[] arr2 = {1, 2, 3, 4, 5, 6};
    int[] mrg = new int[arr1.length + arr2.length];
    int i = 0;
    for (int num : arr1) {
        mrg[i] = num;
        i++;
    }
    for (int num : arr2) {
        mrg[i] = num;
        i++;
    }
    for (int num : mrg) {
        System.out.print(num + " ");
    }
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

