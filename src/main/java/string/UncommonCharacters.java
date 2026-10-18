package string;

public class UncommonCharacters {
    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "cdef";

        System.out.print("Uncommon characters: ");

        // Characters in s1 but not in s2
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            boolean found = false;

            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(ch);
            }
        }

        // Characters in s2 but not in s1
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            boolean found = false;

            for (int j = 0; j < s1.length(); j++) {
                if (ch == s1.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(ch);
            }
        }
    }
}
