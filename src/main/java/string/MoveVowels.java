package string;

public class MoveVowels {
    public static void main(String[] args) {

        String s = "programming";
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels = vowels + ch;
            } else {
                consonants = consonants + ch;
            }
        }

        System.out.println("Output: " + vowels + consonants);
    }
}
