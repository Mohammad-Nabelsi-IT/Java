package ChallengeSystemConsole;

public class ChOne {
    public static void main(String[] args) {
        try {
            System.out.printf("🎰 Calculate average %n");
            String inputNumb1 = System.console().readLine("Enter number one");
            String inputNumb2 = System.console().readLine("Enter number two");
            String inputNumb3 = System.console().readLine("Enter number three");
            String inputCountNumber = System.console().readLine("Enter count number:");
            // covert
            int n1 = Integer.parseInt(inputNumb1);
            int n2 = Integer.parseInt(inputNumb2);
            int n3 = Integer.parseInt(inputNumb3);
            int countNumber = Integer.parseInt(inputCountNumber);

            // Avg
            // (num1 + num2 + num3 ) /3
            int result = (n1 + n2 + n3) / 3;
            System.out.printf("avg number = %d %n", result);
        }
        catch (NullPointerException pointer) {
            System.out.printf("can't run IDE System.console() 🥲  %n");
        } catch (ArithmeticException arithmetic) {
            System.out.printf("please enter count  greater than 0 😇 %n");
        } catch (Exception error) {
            System.out.printf("error : %s %n", error);
        }

    }
    }

