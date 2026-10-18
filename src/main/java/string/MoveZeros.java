package string;

public class MoveZeros {
    public static void main(String[] args) {

        String s = "1020304050";

        String result = "";
        int zeroCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '0') {
                zeroCount++;
            } else {
                result = result + ch;
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            result = result + '0';
        }

        System.out.println("Output: " + result);
    }
}