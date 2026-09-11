package Array;

import java.util.Arrays;

public class moveAllZero {
    public static void main(String[] args) {
        zeroLast();
        zeroFirst();
    }
        public static void zeroLast(){
            int[] arr = {0, 1, 0, 3, 12};
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    index++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        public static  void zeroFirst(){
            int[] arr = {1, 0, 3, 0, 12, 5};

            int index = arr.length - 1;

            for (int i = arr.length - 1; i >= 0; i--) {

                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;

                    index--;
                }
            }

            System.out.println(Arrays.toString(arr));
        }

    }
