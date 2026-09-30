package Array;

import java.security.SignedObject;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class test {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(50, 20, 40, 10, 30);
        Collections.sort(list);
Collections.sort(list,Collections.reverseOrder());
int max=Collections.max(list);
        int min=Collections.min(list);

        System.out.println(list);
        System.out.println(max);
        System.out.println(min);
    }

}



