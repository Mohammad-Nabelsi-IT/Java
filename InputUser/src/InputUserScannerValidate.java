import java.time.LocalDate;
import java.util.Scanner;

public class InputUserScannerValidate {
    public static void main(String[] args) {
        //        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate); // 2024-02-02

//        int currentYear = localDate.getYear();
//        int month = localDate.getMonthValue();
//        int day = localDate.getDayOfMonth();
//        System.out.printf("%d/%d/%d %n", day, month, currentYear);
        int year = LocalDate.now().getYear();
        // input from user
        getInputFormScanner(year);
    }

    public static void getInputFormScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        // Scanner
        System.out.printf("Hi, What's your name? ");
        String inputName = scanner.nextLine();

        System.out.printf("What year were you born? ");
        String inputDob = scanner.nextLine();

        // get age
        int age = checkDate(currentYear, inputDob);
        if (age == -1) {
            System.out.printf("invalid date of birth %s %n ", inputDob);
        } else {
            System.out.printf("your name %s : and age : %d %n ", inputName, age);
        }
    }

    /**
     * checkDate found age and condition date of birth
     *
     * @param currentYear
     * @param dateOfBirth
     * @return age
     */
    public static int checkDate(int currentYear, String dateOfBirth) {

        try {
            // convert int
            int dob = Integer.parseInt(dateOfBirth);
            // 2024-150 = 1874 why (-125) because can't live up 125 years!
            int minimumYear = currentYear - 150;
            // check dob less than minimumYear
            if ((dob < minimumYear) || (dob >= currentYear)) {
                return -1;
            }

            // right
            return (currentYear - dob);
        } catch (NumberFormatException error) {
            System.out.printf("Please Enter Value Just Number Date Of Birth %n");
            return -1;
        } catch (Exception error) {
            System.out.printf(" General Error");
            return -1;
        }
    }
}
