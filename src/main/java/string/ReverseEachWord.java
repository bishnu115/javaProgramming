package string;

public class ReverseEachWord {
    public static void loop() {
        String str = "Java Selenium";
        String[] words = str.split(" ");
        for(String word : words) {
            String rev = "";
            for(int i = word.length()-1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            System.out.print(rev + " ");
        }

    }
        public static void usingStringbuilder(){
            String s = "abc defg hi";
            String[] word = s.split("\\s+");
            for (String words: word) {
                String rev = new StringBuilder(words).reverse().toString();
                System.out.print(rev+" ");

            }
    }


    public static void main(String[] args) {
        usingStringbuilder();

        loop();
    }
}

