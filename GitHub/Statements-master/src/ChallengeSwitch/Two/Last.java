package ChallengeSwitch.Two;

public class Last {
    public static void main(String[] args) {

        char gender = 'v';
        switch (gender){
            case 'M', 'm'-> System.out.println("male");
            case 'F','f'-> System.out.println("Female");
            default -> System.out.println("Unspecified Gender.");
        }


    }
}
