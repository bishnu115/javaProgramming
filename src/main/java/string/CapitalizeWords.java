package string;

public class CapitalizeWords {
    public static void main(String[] args) {

        String s = "java selenium api testing";
        StringBuilder result = new StringBuilder();

        boolean capitalize = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result.append(ch);
                capitalize = true;
            } else {
                if (capitalize) {
                    result.append(Character.toUpperCase(ch));
                    capitalize = false;
                } else {
                    result.append(ch);
                }
            }
        }

        System.out.println(result);
    }
}