package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
        public static void main (String[]args){
            String s = "programming";
            // Store character frequency
            HashMap<Character, Integer> map = new HashMap<>();
            // Count frequency of each character
            for (char c : s.toCharArray()) {

                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            // Find first non-repeating character
            for (char c : s.toCharArray()) {
                if (map.get(c) == 1) {

                    System.out.println("First Non-Repeating Character: " + c);
                    break;
                }
            }
        }
    }