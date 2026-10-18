package string;

import java.util.ArrayList;
import java.util.List;

public class AllPalindromicSubstrings {

    public static List<String> findPalindromes(String s) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindromes
            expand(s, i, i, result);

            // Even-length palindromes
            expand(s, i, i + 1, result);
        }

        return result;
    }

    public static void expand(String s, int left, int right,
                              List<String> result) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            result.add(s.substring(left, right + 1));

            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String input = "aaa";

        List<String> palindromes = findPalindromes(input);

        System.out.println(palindromes);
    }
}
