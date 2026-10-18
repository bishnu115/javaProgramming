package string;

public class CountCharacters {
    public static void main(String[] args) {

        String s = "Java123@#Test";

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z')) {
                letters++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
    }
}