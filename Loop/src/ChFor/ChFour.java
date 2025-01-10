package ChFor;

public class ChFour {
    public static void main(String[] args) {
        System.out.printf("sum number %d %n", calculateEven());

    }

    /**
     * is even check number even or not
     *
     * @param number
     * @return if is even return true otherwise false
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;

    }

    /**
     * calculateEven sum number even between 1 and 100
     *
     * @return sum number type int
     */
    public static int calculateEven() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (isEven(i)) {
                System.out.printf(" %d is number even %n ", i);
                sum += i;
            }
        }
        return sum;
    }


}
