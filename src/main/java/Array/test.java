package Array;

import java.security.SignedObject;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int a = 16;
        int co = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                co++;
            }
        }
        System.out.println(co);
    }

}





