package string;

public class OnlyDigits {
    public static void main(String[] args) {

        String s = "123456";
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                flag = false;
                break;
            }
        }

        if (flag && !s.isEmpty()) {
            System.out.println("Contains only digits");
        } else {
            System.out.println("Does not contain only digits");
        }
    }
}
