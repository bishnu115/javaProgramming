package string;

import java.util.Arrays;

public class anagramCheck {

    public static void main(String[] args) {

        String a = "Listen";
        String b = "silent";

        // Convert to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check length
        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Convert string to char array
        char[] s = a.toCharArray();
        char[] s1 = b.toCharArray();

        // Sort arrays
        Arrays.sort(s);
        Arrays.sort(s1);

        // Compare arrays
        if (Arrays.equals(s, s1)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}