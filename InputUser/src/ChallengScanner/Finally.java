package ChallengScanner;

import java.time.LocalDate;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        /*
            TODO: 1
                    - create method myInfo()
                       * no have parameter (grade 1)
                       * return String     (grade 1)
                       * print the result  (grade 1)
         */
        System.out.println(myInfo());
    }

    public static String myInfo() {
          /*
            TODO: 2 include the method myInfo()
                  - create scanner (grade 2)
                  - read input from User:
                      * first name  (String)  (grade 1)
                         * enter your first name:
                      * last name (String) (grade 1)
                         * enter your lsat name:
                      * gender (String) (grade 1)
                         * enter your gender (m/f)
                      * ssn (String) (grade 1)
                         * enter your Social Security number:
                      * date of birth (int) (grade 1)
                         * enter your date of birth:
                    - check gender enter m or f
                       * m -> in result male (grade 2)
                       * f -> in result female (grade 2)
                       * an other input m/f reQuestion (grade 4)
                         * please enter gender M/F 😉:
                    - check date of birth
                       * create method getAge (grade 6)
                          * have one parameter called dateOfBirth  (grade 1)
                          * calculate age (currentYear - dateOfBirth) (grade 1)
                          * check dateOfBirth grater than currentYear (grade 1)
                          * check dateOfBirth less than before 150 year (grade 1)
                          * return age when not valid dob return -1 (grade 1)
                          * create doc (grade 1)
                        * case age -1 reQuestion
                           * Please enter your date of birth valid 😉: (grade 3)
                     - return all data input as format String  (grade 3)
                        * Tip: used String.format()
                     - add Try & catch all method (grade 3)
                     - write Doc (grade 2)

                     - Good Luck 😇f
         */
        Scanner scanner = new Scanner(System.in);

        // read first name
        System.out.printf("enter your first name: ");
        String firstName = scanner.nextLine();

        // read last name
        System.out.printf("enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.printf("enter your gender (m/f): ");
        String answerGender = scanner.nextLine();

        // read ssn
        System.out.printf("enter your Social Security number: ");
        String ssn = scanner.nextLine();


            String gender = "";
            while (true) {
                if (answerGender.equals("m") || answerGender.equals("M")) {
                    gender = "Male";
                    break;
                } else if (answerGender.equals("f") || answerGender.equals("F")) {
                    gender = "Female";
                    break;
                } else {
                    System.out.printf("please enter gender M/F \uD83D\uDE09: ");
                    answerGender = scanner.nextLine();
                }
            }

            // read date of birth
            System.out.printf("enter your date of birth: ");
            int dob = scanner.nextInt();


            while (getAge(dob) == -1) {
                System.out.printf("Please enter your date of birth valid 😉: ");
                dob = scanner.nextInt();
            }

            return String.format("first name : %s, last name %s, Social Security number: %s, " + "age : %d, gender: %s", firstName, lastName, ssn, getAge(dob), gender);

        }


    /**
     * getAge check date of birth greater than current year and less than age 1874
     *
     * @param dateOfBirth
     * @return age (currentYear - dateOfBirth)
     */

    public static int getAge(int dateOfBirth) {
        int currentYear = LocalDate.now().getYear();
        // 2024-150 = 1874 why (-150) because can't live up 150 years!
        int minYear = currentYear - 150;
        // check dob less than minimumYear
        if (dateOfBirth < minYear || dateOfBirth >= currentYear) {
            return -1;
        }
        return currentYear - dateOfBirth;


    }

}

