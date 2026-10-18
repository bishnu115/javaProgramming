import java.util.*;

public class demo {

    public static void main(String[] args) {

        String s = "programmmming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        char maxchar = ' ';
        for (char c : map.keySet()) {

            if (map.get(c) > max) {
                max = map.get(c);
                maxchar = c;
            }
        }
        System.out.println(max + " times " + maxchar);
    }

}















