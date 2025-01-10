public class StatementsSwitch {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        // switch int
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;


            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("please enter 1 to 7");

        }


        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("please enter 1 to 7");
        }

        // `a` or `b` or `c` output (abc)
        // `q` or `w` or `e` or `r` output (qwer)
        char choiceUser = 'v';
        switch (choiceUser) {
            // group case
            case 'a':
            case 'b':
            case 'c':
                System.out.println("abc");
                break;
            // group case
            case 'q':
            case 'w':
            case 'e':
            case 'r':
                System.out.println("qwer");
                break;
            default:
                System.out.println("invalid choice!");
        }

        // group case
        if (choiceUser == 'a' || choiceUser == 'b' || choiceUser == 'c') {
            System.out.println("abc");
            // group case
        } else if (choiceUser == 'q' || choiceUser == 'w' || choiceUser == 'e' || choiceUser == 'r') {
            System.out.println("qwer");
        } else {
            System.out.println("invalid choice!");
        }

        switch (choiceUser) {
            // group case
            case 'a', 'b', 'c' -> System.out.println("abc");

            // group case
            case 'q', 'w', 'e', 'r' -> System.out.println("qwer");
            default -> System.out.println("invalid choice!");
        }
    }
}
