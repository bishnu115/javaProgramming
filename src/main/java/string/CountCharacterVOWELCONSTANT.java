package string;

public class CountCharacterVOWELCONSTANT {
    public static void main(String[] args) {
        String str = "bish";
        int vowel=0;
        int co=0;
        for (int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }
            else {
                co++;
            }
        }
        System.out.println(vowel);
        System.out.println(co);

    }
    // different approach
    public void m(){
        String s1 = "qwertyuio";
        int vo = 0;
        int con = 0;

        for (char ch : s1.toLowerCase().toCharArray()) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vo++;
            } else{  // Only alphabets should be counted as consonants
                con++;
            }
        }

        System.out.println("Vowels Count: " + vo);
        System.out.println("Consonants Count: " + con);
    }
}

