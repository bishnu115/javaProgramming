package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String input = "abc def";
        String revsen="";
       String[] s1=input.split("\\s+");
       for (String ch: s1){
           String revword="";

           for (int i=ch.length()-1;i>=0;i--){
               revword=revword+ch.charAt(i);
           }
           revsen=revsen+revword+" "  ;
       }
        System.out.println("the word i: "+revsen.trim());

    }
}