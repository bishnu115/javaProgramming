package string;

public class RemoveconsutiveDuplicates {
    public static void main(String[] args) {

        String s = "oaaabbccdaao";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        System.out.println(result);
    }
}