package ChSwitch;

public class ChTree {
    public static void main(String[] args) {
        // Write a program to Check whether a character is a vowel or consonant using a switch statement

        // Tip:
        // create var type char name (ch) type `char`
        // vowel -> A E I O U
        // consonant -> all character
        // using switch statements
        // number check just alphabet (if & else) (first code)

        // test case:
        // 1: enter value alphabet ex: (A to Z and a to z)
        // a: a is alphabet vowel
        // x: x is alphabet consonant
        char ch ='e';
        if ((ch>='A'&& ch <='Z') ||( ch>='a'&& ch<='z')){

            switch (ch){
                case'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'U':
                case 'u':
                case 'O':
                case 'o':
                    System.out.println("is alphabet vowel");
                    break;
                default:
                    System.out.println("is alphabet consonant");
            }

        }else {
            System.out.println("enter value alphabet ex: (A to Z and a to z)");
        }
    }
}
