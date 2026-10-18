package string;

public class CommonCharacters {
    public static void main(String[] args) {

        String s1 = "program";
        String s2 = "automation";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {

                    if (result.indexOf(String.valueOf(ch)) == -1) {
                        result.append(ch);
                    }

                    break;
                }
            }
        }

        System.out.println("Common characters: " + result);
    }
}