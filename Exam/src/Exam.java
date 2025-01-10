import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        myInfo();

    }//main

    /*
         TODO: 1
                 - create method myInfo() (Mark 6)
                    * no have parameter (Mark 2)
                    * return String     (Mark 2)
                    * print the result  (Mark 2)
    */
    /*
   TODO: 2 include the method myInfo()
         - message (Mark 2)
            * Welcome to Mystro, help us fill out your information
         - create scanner (Mark 2)
         - read input from User: (Mark 18)
             * first name  (String)  (Mark 2)
                * enter your first name:
             * last name (String) (Mark 2)
                * enter your lsat name:
             * email (String) (Mark 2)
                * enter your email:
             * address (String) (Mark 2)
                * enter your address:
             * gender (String) (Mark 2)
                * enter your gender (m/f)
             * ssn (String) (Mark 2)
                * enter your Social Security number:
             * Information about programming (String) (Mark 2)
                * Have you studied programming before? (yes/no):
              * Required specialty (String) (Mark 2)
                * Enter the required specialization:(Java, Flutter, AI, web):
             * date of birth (int) (Mark 2)
                * enter your date of birth:
           - check gender enter m or f (Mark 8)
              * v.v.v.imp write code below read gender
              * m -> in result male (Mark 2)
              * f -> in result female (Mark 2)
              * an other input m/f reQuestion (Mark 4)
                * please enter gender M/F 😉:
           - check date of birth (Mark 16)
              * create method getAge (Mark 12)
                 * have one parameter called dateOfBirth  (Mark 2)
                 * check dateOfBirth grater than currentYear (Mark 2)
                 * check dateOfBirth less than before 150 year (Mark 2)
                 * calculate age (currentYear - dateOfBirth) (Mark 2)
                 * return age when not valid dob return -1 (Mark 2)
                 * create doc (Mark 2)
               * case age -1 reQuestion (Mark 4)
                   * v.v.v.imp write code below read birth
                  * Please enter your date of birth valid 😉: (Mark 4)
            - return all data input as format String  (Mark 12)
               * Tip: used String.format()
               * Tip: need message before print info
                      * Thank you, your request is under study
               * Tip: Every information is on a new line
            - add Try & catch  just input dob add Expectation: InputMismatchException (Mark 4)
            - write Doc (Mark 2)
            - Good Luck 😇
*/

    /**
     * method name myInfo
     *  don't have parameter
     * @return String Format
     */
    public static String myInfo() {
        System.out.printf("Welcome to Mystro, help us fill out your information");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("enter your first name:");
        String firstName = scanner.nextLine();

        System.out.printf("enter your last name:");
        String lastName = scanner.nextLine();

        System.out.printf("enter your email:");
        String email = scanner.nextLine();

        System.out.printf("enter your address:");
        String adress = scanner.nextLine();

        System.out.printf("enter your gender (m/f):");
        String gender = scanner.nextLine();
        String answerGender = "";
        while (true) {
            if (answerGender.equals("m") || answerGender.equals("M")) {
                gender = "Male";
                break;
            } else if (answerGender.equals("f") || answerGender.equals("F")) {
                gender = "Female";
                break;
            } else {
                System.out.printf("please enter gender M/F \uD83D\uDE09:");
            }
        }

        System.out.printf("enter your Social Security number:");
        String ssn = scanner.nextLine();

        System.out.printf("Information about programming %n Have you studied programming before? (yes/no):");
        String info = scanner.nextLine();

        System.out.printf("Required specialty");
        System.out.printf("Java, Flutter, AI, web");
        String required = scanner.nextLine();

        int dateOfBirth = 0;
        try {
            System.out.printf("enter your date of birth:");
            dateOfBirth = scanner.nextInt();

            while (getAge(dateOfBirth) == -1) {
                System.out.printf("Please enter your date of birth valid \uD83D\uDE09:");
                dateOfBirth = scanner.nextInt();
            }
        } catch (InputMismatchException error) {

        } catch (Exception error) {
            System.out.printf("General Error");
        }


        return String.format("Thank you, your request is under study" + "first name: %s %n" + "last name: %s %n" + "email: %s %n" +
                "adress: %s %n" + "gender: %s %n" + "Social Security number: %s %n" +
                "programming before: %s %n" + "Required specialty: %s %n" + "age: %d %n", firstName, lastName, email, adress, answerGender, ssn, info, required, getAge(dateOfBirth));
    }// myInfo

    /**
     * method name getAge
     * have one parameter
     * @param dateOfBirth
     * @return currentYear - dateOfBirth = age
     */
    public static int getAge(int dateOfBirth) {


        int currentYear = LocalDate.now().getYear();
        int minYear = currentYear - 150;
        if (dateOfBirth < minYear || dateOfBirth >= currentYear) {

            return -1;
        }
        return currentYear - dateOfBirth;

    }


}//class
