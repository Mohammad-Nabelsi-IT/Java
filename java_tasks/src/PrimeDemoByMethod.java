public class PrimeDemoByMethod {

    public static void main(String[] args) {
        for (int i = 2; i <= 100 ; i++) {
            if( isPrime(i)){
                System.out.println(i + " is prime");
            }else{
                System.out.println(i + " is not prime");
            }
        }
    }
    static boolean isPrime(int number){
        for (int i = 2; i <  number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return  true;
    }

}
