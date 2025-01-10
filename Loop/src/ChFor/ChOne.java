package ChFor;

public class ChOne {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(-1));
        System.out.println(isPrime(29));

    }

    /**
     * isPrime job check number is prime or not
     * is prime : divide 1 and itself
     *
     * @param number check is prime or not
     * @return boolean true is prime otherwise false ( not prime )
     */
    public static boolean isPrime(int number) {
        // because number 1 isn't prime
        if (number <= 2) {
            return number == 2;
        }
        // check between range ex 20 ( start 2 to 19 )
        //for (int i = 2; i <= number / -1; i++) {
        // check between range ex 20 ( start 2 to 10 )
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                // not is prime
                return false;
            }
        }
        // is prime only divide 1 and itself
        return true;
    }

}
