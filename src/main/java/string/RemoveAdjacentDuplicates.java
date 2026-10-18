package string;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {

        String s = "abccba";

        StringBuilder result = new StringBuilder(s);
        int i = 0;

        while (i < result.length() - 1) {
            if (result.charAt(i) == result.charAt(i + 1)) {
                result.delete(i, i + 2);

                // Check again from the previous position
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        System.out.println("Output: " + result);
    }
}