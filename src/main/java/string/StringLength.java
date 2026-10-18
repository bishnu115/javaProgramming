package string;

public class StringLength {
    public static void main(String[] args) {

        String s = "Automation";
        int count = 0;

        for (char ch : s.toCharArray()) {
            count++;
        }

        System.out.println("Length of string: " + count);
    }
}