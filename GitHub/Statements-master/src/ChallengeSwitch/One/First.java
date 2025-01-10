package ChallengeSwitch.One;

public class First {
    public static void main(String[] args) {
        // convert switch to if statements

        char grade ='A';

        switch (grade){
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


    }

}
