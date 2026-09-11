package Array;

import java.security.SignedObject;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = {133, 23, 3, 2, -4, 2023, 1, 2};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                smax = num;
                max = num;
            } else if (num > smax) {
                smax = num;

            }
        }

        System.out.println(smax);
    }

}


