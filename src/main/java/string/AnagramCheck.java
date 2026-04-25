package string;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

            String s4 = "qwert";
            String s5 = "qwert ";
            String s1 = s4.toLowerCase().replaceAll("\\s", "");
            String s2 = s5.toLowerCase().replaceAll("\\s", "");

            if (s1.length() != s2.length()) {
                System.out.println("noq");
                return;
            }

            char[] bb = s2.toCharArray();
            char[] aa = s1.toCharArray();
            Arrays.sort(aa);
            Arrays.sort(bb);
            boolean result = Arrays.equals(aa, bb);
            if (result) {
                System.out.println("gf");

            } else {
                System.out.println("gtreg");
            }
        }
    }
