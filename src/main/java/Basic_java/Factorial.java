package Basic_java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int num = 3;

        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

