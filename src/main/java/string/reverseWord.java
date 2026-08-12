package string;

public class reverseWord {
    public static void main(String[] args) {
        String str = "i am working with infosys";

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
