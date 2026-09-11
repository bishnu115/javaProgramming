package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateSimple {

    public static void main(String[] args) {
        uniqueCharacter();
        System.out.println();
        DuplicateCharacter();
    }

    public static void uniqueCharacter() {
        String s = "programmmmmming";
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.add(c)) {
                System.out.print(c);
            }
        }
    }

    public static void DuplicateCharacter() {
        String s = "programmmmmming";
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> du = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                du.add(c);
            }
        }
        System.out.println(du);
    }

}




