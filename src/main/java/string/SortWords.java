package string;

import java.util.Arrays;

public class SortWords {
    public static void main(String[] args) {

        String s = "java selenium api testing";

        String[] words = s.split(" ");

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println(String.join(" ", words));
    }
}