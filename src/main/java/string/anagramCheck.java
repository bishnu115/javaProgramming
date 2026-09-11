package string;

import java.util.Arrays;

public class anagramCheck {

    public static void main(String[] args) {
        m1();
       m2();

    }
    public static void m1() {
        String a = "Listen";
        String b = "silent";
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] s = a.toCharArray();
        char[] s1 = b.toCharArray();
        Arrays.sort(s);
        Arrays.sort(s1);
        if (Arrays.equals(s, s1)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
    public static void m2(){
        char[] a1 = "listen".toCharArray();
        char[] a2 = "silent".toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1, a2) ? "Anagram" : "Not Anagram");

    }


}
