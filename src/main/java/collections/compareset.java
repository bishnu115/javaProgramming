package collections;

import java.util.HashMap;
import java.util.Map;

public class compareset {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 90);
        map1.put("Selenium", 80);
        map1.put("SQL", 70);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("SQL", 70);
        map2.put("Java", 90);
        map2.put("Selenium", 80);


        if (map1.equals(map2)) {
            System.out.println("Maps are equal");
        } else {
            System.out.println("Maps are not equal");
        }

    }
}
