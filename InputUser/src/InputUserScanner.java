import java.util.Scanner;

public class InputUserScanner {
    public static void main(String[] args) {
        // create object scanner
        // System.in = input  | System.out = output
        // Note: Auto import
        // setting -> Editor -> General -> Auto import
        // check ✅ on
        // 1- check optimize imports on the fly
        // 2- add fly
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Hi whats your name ? ");
        String name = scanner.nextLine();
        System.out.printf("HI %s, thanks for taking the course! %n",name);

        System.out.printf("Enter Current Year : %n");
        String inputCurrentYear= scanner.nextLine();

        System.out.printf("Enter Date Of Birth %n");
        String inputDateBirth = scanner.nextLine();

        foundAge(inputCurrentYear,inputDateBirth);
    }
    /**
     * found age get age depended on current year and date of birth
     * @param currentYear
     * @param dob date of birth
     */
    public static void foundAge(String currentYear, String dob){
        int year =Integer.parseInt(currentYear);
        int dateOfBirth = Integer.parseInt(dob);

        int result = year - dateOfBirth;
        System.out.printf("your age = %d %n ",result);
    }
}
