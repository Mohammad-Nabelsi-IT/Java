package ChallengeSystemConsole;

public class ChFour {
    public static void main(String[] args) {
        try {
            String inputNumber1 = System.console().readLine("Enter Number One");
            String inputNumber2 = System.console().readLine("Enter Number Two");
            String inputNumber3 = System.console().readLine("Enter Number Three");

            int n1 = Integer.parseInt(inputNumber1);
            int n2 = Integer.parseInt(inputNumber2);
            int n3 = Integer.parseInt(inputNumber3);

            System.out.println(hasEqualSum(n1, n2, n3));
        } catch (NumberFormatException e) {
            System.out.printf("Please Enter Just Number");
        } catch (NullPointerException error) {
            System.out.printf("can't run pleas used terminal");
        } catch (Exception error) {
            System.out.printf("error general");
        } finally {
            System.out.printf("goodbye take care\uD83E\uDD17");
        }

    }
    /**
     * check sum number first and second number equal third number
     *
     * @param fNumber
     * @param sNumber
     * @param tNumber
     * @return sum number first and second number equal third number return true otherwise and false
     */
    public static boolean hasEqualSum(int fNumber, int sNumber, int tNumber) {
        return (fNumber + sNumber) == tNumber;
    }
}
