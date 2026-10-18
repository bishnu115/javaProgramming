package string;

public class Alphanumeric {
    public static void main(String[] args) {

        String s = "Java123";
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9'))) {
                flag = false;
                break;
            }
        }

        if (flag && !s.isEmpty()) {
            System.out.println("Contains only alphanumeric characters");
        } else {
            System.out.println("Does not contain only alphanumeric characters");
        }
    }
}