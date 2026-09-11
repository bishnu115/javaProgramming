package Basic_java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {


         /*1³ + 5³ + 3³
         = 1 + 125 + 27
         = 153
        */

        int num = 153;
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

