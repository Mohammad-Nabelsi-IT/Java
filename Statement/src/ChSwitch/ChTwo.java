package ChSwitch;

public class ChTwo {
    public static void main(String[] args) {
        // Write a program enter the gender and print the corresponding gender using a switch statement
        //  m or M -> male
        // f or F -> Female
        //  Tip:
        //  Switch Group
        char gender = 'm';
        switch (gender) {
            case 'm', 'M' -> System.out.println("Male");
            case 'f', 'F' -> System.out.println("Female");
            default -> System.out.println("Unspecified Gender");
        }


    }
}
