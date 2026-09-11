import java.util.*;

public class demo {

    public static void main(String[] args) {
        String s = "iiiiiii er  erer ooooooo";
        String[] sp = s.split("\\s+");
        String lo = "";
        for (String r : sp) {
            if (r.length() > lo.length()) {
                lo = r;
            }
        }
        System.out.println(lo);

    }

}













