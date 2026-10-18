package string;

public class StringIntConvert {

public static void StringToInt(){
    String s = "123";

    int num = Integer.parseInt(s);

    System.out.println(num + 10);
}

    public static void IntToString(){
        int num = 123;

       // String s = String.valueOf(num);
        String s = Integer.toString(123);
        System.out.println(s + 10);
    }
    public static void main(String[] args) {
        IntToString();
    }
}
