package string;
import java.util.HashSet;

    public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        // Hashset Store unique characters
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            // Remove duplicates
            /*
            initialy while loop is false so all character add in set.add when
            it found duplicate while loop is true and it enter while loop and
            remove the left one and increse the left by 1
             */
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add current character
            set.add(s.charAt(right));
            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println("Length Of Longest Substring: " + maxLength);
    }
}