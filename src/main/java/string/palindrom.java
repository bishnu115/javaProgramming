package string;

public class palindrom {

    public static void palindromw() {
        String str = "12321";
//        String rev = new StringBuilder(str).reverse().toString();
//        System.out.println(str.equals(rev));
        StringBuilder rev=new StringBuilder(str);
        String sad= rev.reverse().toString();
       System.out.println(str.equals(sad));

    }



    public static boolean apnacollege() {
        String str = "a11ssa";
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;

            }
        }
    return true;
    }


    public static void main(String[] args) {
        //  palimdromusingforloop();
          palindromw();
//        apnacollege();
      //  System.out.println(apnacollege());

    }
}
// String input = "wwww";
//
//        boolean isPalindrome = true;
//
//        for (int i = 0; i < input.length() / 2; i++) {
//            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
//                isPalindrome = false;
//                break;  // stop checking further
//            }
//        }
//
//        if (isPalindrome) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//    }}