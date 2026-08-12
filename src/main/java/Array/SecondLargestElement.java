package Array;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        m1();
        m2();


    }

    public static void m1() {
        int[] arr = {10, 5, 20, 8, 15};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }


    public static void m2() {

        int[] arr = {10, 20, 40, 30, 50};

        Arrays.sort(arr);

        System.out.println("Second Largest: " + arr[arr.length - 2]);
    }
}


