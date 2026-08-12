package Array;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, -8, 15};
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
      for (int num:arr){
          if((num>lar)) {
              lar=num;
          }else{
              if (num>sec && num!=lar){
                sec=num;
              }
          }
      }
        System.out.println(lar);
        System.out.println(sec);
    }
    }
