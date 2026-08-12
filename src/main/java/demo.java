import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class demo {

    public static void main(String[] args) {
        String s = "abcabcbb";

  HashSet<Character>set=new HashSet<>();
   int left=0;
   int maxLangth=0;
   for (int right=0;right<s.length();right++){
       while (set.contains(s.charAt(right))){
           set.remove(s.charAt(right));
           left++;
       }
       set.add(s.charAt(right));
       maxLangth=Math.max(maxLangth,right-left+1);

   }
        System.out.println(maxLangth);

    }

}













