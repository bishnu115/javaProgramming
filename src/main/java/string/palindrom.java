package string;

public class palindrom {

    public static void palindromw() {
        String str = "12321";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev));
    }

    public static void loop() {
        String s1 = "asdsa";
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }

        System.out.println(s1.equals(rev)?"pali":"no pal");
        if (s1.equals(rev)) {
            System.out.println("pal");
        } else {
            System.out.println("wefffe");
        }



    }

    public static void main(String[] args) {
      //  palindromw();
        loop();
    }
}
