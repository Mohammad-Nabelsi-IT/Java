package ChallengeSwitch.Three;

public class Last {
    public static void main(String[] args) {

        char ch = 5;

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // alphabet
            switch (ch) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is alphabet vowel");
                default -> System.out.println(ch + " is alphabet consonant");
            }
        } else {
            // not alphabet
            System.out.println(" number not  alphabet ex: (A to Z and a to z)");
        }
    }
}
