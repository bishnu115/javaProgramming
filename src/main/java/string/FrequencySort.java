package string;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {

        String s = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Store characters in a list
        List<Character> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency in descending order
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Print characters and frequencies
        for (char c : list) {
            System.out.println(c + " -> " + map.get(c));
        }
    }
}
