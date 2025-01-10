package ChallengLevelOne;

public class ChFour {
    public static void main(String[] args) {
        // test case
        // a
        // I
        // w
        // q
        // o
        System.out.println(isVowel('a'));
        System.out.println(isVowel('I'));
        System.out.println(isVowel('w'));
        System.out.println(isVowel('q'));
        System.out.println(isVowel('o'));

    }//main

    public static boolean isVowel(char ch) {

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {


            switch (ch) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                    return true;
                default:
                    return false;
            }
        } else {
            System.out.println("Please Enter Alphabet");
            return false;
        }

    }


}//class
