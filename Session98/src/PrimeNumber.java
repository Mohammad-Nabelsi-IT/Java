public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            if (isPrime(i))
                System.out.println(i+" is Prime");
            else System.out.println(i+" is not Prime");
        }
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
