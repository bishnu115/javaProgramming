package string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String s = "java is good and java is easy";
        // Split sentence into words
        String[] words = s.split("\\s+");

        // Store word frequency
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Print duplicate words
        for (String word : map.keySet()) {
            if (map.get(word) > 1) {
                System.out.println(word + " -> " + map.get(word));
            }
        }
    }
}
