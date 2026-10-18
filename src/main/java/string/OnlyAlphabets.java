package string;

public class OnlyAlphabets {
    public static void main(String[] args) {

        String s = "JavaTesting";
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z'))) {
                flag = false;
                break;
            }
        }

        if (flag && !s.isEmpty()) {
            System.out.println("Contains only alphabets");
        } else {
            System.out.println("Does not contain only alphabets");
        }
    }
}