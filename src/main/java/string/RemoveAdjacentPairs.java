package string;

public class RemoveAdjacentPairs {
    public static void main(String[] args) {

        String s = "abccba";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int len = result.length();

            if (len > 0 && result.charAt(len - 1) == ch) {
                result.deleteCharAt(len - 1);
            } else {
                result.append(ch);
            }
        }

        System.out.println("Output: " + result);
    }
}