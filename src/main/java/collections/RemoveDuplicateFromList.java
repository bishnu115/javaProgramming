package collections;

import java.util.*;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(12,33,44,55,66,66,55);
        Set<Integer> set=new HashSet<>(list);//insertion order not maintain
        Set<Integer>res=new LinkedHashSet<>(list);
        System.out.println(res);


    }

    }
