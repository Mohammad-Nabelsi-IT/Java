package ChSwitch;

public class ChOne {
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
        char grade1 = 'A';
        if (grade1 == 'A') {
            System.out.println("Excellent");
        } else if (grade1 == 'B') {
            System.out.println("Good");
        } else if (grade1 == 'C') {
            System.out.println("Fair");
        } else if (grade1 == 'D') {
            System.out.println("Poor");
        } else {
            System.out.println("Invalid Choice");
        }

    }
}
