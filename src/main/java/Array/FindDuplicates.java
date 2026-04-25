package Array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr={1,3,4,5,4,3,2};

        Set<Integer>set=new HashSet<>();
        Set<Integer>duplicate=new HashSet<>();
        for(int num:arr){
            if (!set.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println("duplicate: "+duplicate);

    }
}

