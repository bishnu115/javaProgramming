package string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {

        // Input string
        String s = "programming";
        /*
         HashMap is used to store:
         Key   -> Character
         Value -> Frequency count
        */
        HashMap<Character, Integer> map = new HashMap<>();
        /*
         toCharArray() converts string into character array
         so we can iterate character by character
        */
        for (char c : s.toCharArray()) {
            /*
             getOrDefault(c,0)

             - If character already exists:
                   returns old count

             - If character does not exist:
                   returns 0

             Then +1 increases frequency count
            */
            //map.put(key, value);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        /*
         keySet() returns all characters from HashMap
        */
        System.out.println("total : "+map);

        for (char c : map.keySet()) {

            /*
             If frequency > 1
             then character is duplicate
            */
            if (map.get(c) > 1) {
                System.out.println(c + " -> " + map.get(c));
            }

        }
    }
}





