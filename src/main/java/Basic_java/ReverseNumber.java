package Basic_java;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 45678;

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;       // Get the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            number = number / 10;          // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);

    }
}

