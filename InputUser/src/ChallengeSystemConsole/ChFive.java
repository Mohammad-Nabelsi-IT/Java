package ChallengeSystemConsole;

public class ChFive {
    //  string console number
    public static void main(String[] args) {
        try {
            String input1 = System.console().readLine("enter number one :");
            String input2 = System.console().readLine("enter number two :");
            String operator = System.console().readLine("select : +, -, *, /, %%:");
            // convert string to double number
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            // calculator  num1 and num2 // operator (+, -, *, /, %)
            calculator(num1, num2, operator);
        } catch (NumberFormatException error) {
            System.out.printf("Please Enter Just Number");
        } catch (Exception error) {
            System.out.printf("error general");
        } finally {
            System.out.printf("Goodbye");
        }
    }

    /**
     * sum numbers
     *
     * @param n1
     * @param n2
     * @return double
     */
    public static double addition(double n1, double n2) {
        return n1 + n2;
    }

    /**
     * subtraction numbers
     *
     * @param n1
     * @param n2
     * @return double
     */
    public static double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    /**
     * multiply numbers
     *
     * @param n1
     * @param n2
     * @return double
     */
    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    /**
     * divide numbers
     *
     * @param n1
     * @param n2
     * @return double
     */
    public static double divide(double n1, double n2) {
        return n1 / n2;
    }

    /**
     * reminder numbers
     *
     * @param n1
     * @param n2
     * @return double
     */
    public static double reminder(double n1, double n2) {
        return n1 % n2;
    }

    /**
     * calculator numbers
     *
     * @param number1
     * @param number2
     * @param operator return void
     */
    public static void calculator(double number1, double number2, String operator) {
        System.out.println("run calculator");
        // if (operator.equals("+")){
//
        //  System.out.printf("sum numbers (%.2f + %.2f) = %.2f",number1,number2,addition(number1,number2));
        // } else if (operator.equals("-")) {
        //     System.out.printf("subtraction numbers (%.2f - %.2f) = %.2f",number1,number2,subtraction(number1,number2));
//
        // }
        switch (operator) {
            case "+" ->
                    System.out.printf("sum numbers (%.2f + %.2f) = %.2f", number1, number2, addition(number1, number2));
            case "-" ->
                    System.out.printf("subtraction numbers (%.2f - %.2f) = %.2f", number1, number2, subtraction(number1, number2));
            case "*" ->
                    System.out.printf("multiply numbers (%.2f * %.2f) = %.2f", number1, number2, multiply(number1, number2));
            case "/" ->
                    System.out.printf("divide numbers (%.2f / %.2f) = %.2f", number1, number2, divide(number1, number2));
            case "%" ->
                    System.out.printf("reminder numbers (%.2f %% %.2f) = %.2f", number1, number2, reminder(number1, number2));
            default -> System.out.printf("Please Enter Just (+, -, *, /, %%)");
        }
    }
}
