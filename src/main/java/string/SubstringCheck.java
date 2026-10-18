package string;

public class SubstringCheck {
    public static void main(String[] args) {

        String s1 = "automation";
        String s2 = "mat";

        boolean found = false;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            int j;

            for (j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }

            if (j == s2.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
    }
}