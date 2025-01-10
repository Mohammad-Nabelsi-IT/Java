package Six;

public class Solve {
    public static void main(String[] args) {
        //for (int i = 1; i <= 200; i++) {
        //    if (isEven(i)) {
        //        System.out.printf("%d number is even %n",i);
        //    }
        //}
        int i = 1;
        int countEven = 0;
        while (countEven < 50) {

            if (isEven(i)) {
                System.out.printf("%d number is Even %n", i);
                countEven++;
            }
            // number loop
            i++;
        }
    }

    public static boolean isEven(int number) {
        // != ! =
        return (number % 2 == 0);
    }
}
