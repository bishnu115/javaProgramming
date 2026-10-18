package collections;

import java.util.*;

public class listToSet {
    public static void listToSet(Integer... numbers) {

        List<Integer> list = Arrays.asList(numbers);

        Set<Integer> set = new LinkedHashSet<>(list);

        System.out.println(set);
    }

    public static void SetToList() {

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(11, 22, 33, 22, 123, 11));
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

    }
    public static void ArraysToList(){
        Integer[] arr={11,22,33,44,3};
        List<Integer>list=Arrays.asList(arr);
        System.out.println(list);
    }

    public static void main(String[] args) {
        listToSet(11, 22, 33, 44, 66, 44);
        SetToList();
        ArraysToList();

    }
}
