package string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void WithoutusingHashmap() {
        String s = "java";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }
            System.out.println(ch[i]+" = "+ count);

        }

    }

    public static void usingHashmap() {
        String s = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

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
        for (char c : map.keySet()) {

            if (map.get(c) > 1) {
                System.out.println(c + " -> " + map.get(c));
            }
        }

        /* max character
         int max = 0;
        char maxchar = ' ';
        for (char c : map.keySet()) {

            if (map.get(c) > max) {
                max = map.get(c);
                maxchar = c;
            }
        }
        System.out.println(max + " times " + maxchar);


         */
    }

    /*

        int max = 0;
        int secondMax = 0;
        char maxChar = ' ';
        char secondChar = ' ';

        // Find highest and second-highest frequencies
        for (char c : map.keySet()) {
            int count = map.get(c);

            if (count > max) {
                secondMax = max;
                secondChar = maxChar;

                max = count;
                maxChar = c;
            } else if (count > secondMax && count < max) {
                secondMax = count;
                secondChar = c;
            }
        }

        if (secondMax == 0) {
            System.out.println("No second most frequent character");
        } else {
            System.out.println(secondChar + " -> " + secondMax);
        }
    }
}
     */

    /*
         int min = Integer.MAX_VALUE;
        char minChar = ' ';

        // Find least frequent character
        for (char c : map.keySet()) {
            if (map.get(c) < min) {
                min = map.get(c);
                minChar = c;
            }
        }

        System.out.println("Least frequent character: " + minChar);
        System.out.println("Frequency: " + min);
    }
     */

    public static void main(String[] args) {
       // usingHashmap();
        WithoutusingHashmap();
    }
}





