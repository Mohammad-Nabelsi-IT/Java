package ChFor;

public class ChFive {
    // Write a program to find the factorial value of any number
    // create method factorial has one parameter int type called number
    // return result
    // 5! = 5*4*3*2*1 = 120
    // 5! = 1*2*3*4*5 = 120
    // fact *=i;
    public static void main(String[] args) {
        System.out.printf("fact number : %d %n", factorial(5));
        System.out.printf("fact number : %d %n", factorial(3));
        System.out.printf("fact number : %d %n", factorial(4));
    }

    /**
     * factorial  ex: 5! = 5*4*3*2*1
     *
     * @param number
     * @return result fact
     */
    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
