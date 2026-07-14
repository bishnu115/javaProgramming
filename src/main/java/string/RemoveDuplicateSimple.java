package string;

import java.util.HashSet;

public class RemoveDuplicateSimple {

    public static void main(String[] args) {

        String s = "programming";

        HashSet<Character> set = new HashSet<>();
/*set create a new set{} which is empty then
        it check after for loop "p" is present if not set.add(c) add p in that set like {p}
        *\
 */
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                System.out.print(c);
                set.add(c);
            }
        }
    }
}


