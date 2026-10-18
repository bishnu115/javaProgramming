package string;

public class CountWords {
    public static void main(String[] args) {

        String s = "Java Selenium API Testing";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' &&
                    (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        System.out.println("Word count: " + count);
    }
}