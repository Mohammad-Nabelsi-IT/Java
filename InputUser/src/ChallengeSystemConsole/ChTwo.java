package ChallengeSystemConsole;

public class ChTwo {
    public static void main(String[] args) {
        try {


            System.out.printf("+ sum number Double %n");

            String inputNum1 = System.console().readLine("Enter number one:");
            String inputNum2 = System.console().readLine("Enter number two:");
            String inputNum3 = System.console().readLine("Enter number three:");

            double num1 = Double.parseDouble(inputNum1);
            double num2 = Double.parseDouble(inputNum2);
            double num3 = Double.parseDouble(inputNum3);

            double sum = num1 + num2 + num3;
            System.out.printf("sum ( %.2f + %.2f + %.2f ) %.2f %n", num1, num2, num3, sum);
            System.out.println("Good Bay");

        }
        catch (NumberFormatException error){
            System.out.printf("Please Enter Just Only Number %n");
        }
        catch (NullPointerException error){
            System.out.printf("Please Run Terminal");
        }
        catch (Exception error){
            System.out.printf("Error: %s %n",error);
        }
        }
}
