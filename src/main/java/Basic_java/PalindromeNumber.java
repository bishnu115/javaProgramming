package Basic_java;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 5;

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }


    }
}

