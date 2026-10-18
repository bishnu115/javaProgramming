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
//Reverse a string while preserving the original positions of spaces.
    public static void m(){
        String s = "ab c de";
        char[] ch = s.toCharArray();
//left starts at the beginning.
//
//right starts at the end.
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
//: Check whether the left character is a space
            //If it is a space, skip it without changing its position.
            if (ch[left] == ' ') {
                left++;
             //   Check whether the right character is a space
             //If it is a space, move the right pointer backward.
            } else if (ch[right] == ' ') {
                right--;
            } else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(ch));
    }


    public static void main(String[] args) {
      //  palindromw();
        loop();
    }
}
