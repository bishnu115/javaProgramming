package string;

public class reverse {

    public static void reverseUsingStringbuilder() {

        String name = "bishnu";
        String rev = new StringBuilder(name).reverse().toString();
        System.out.println(rev);
    }
    public static void reverseUsingForLoop() {

        String name = "Bishnu charana";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("rev is : " + rev);
    }
     public static void main(String[] args) {
        reverseUsingStringbuilder();
        reverseUsingForLoop();
    }
}
