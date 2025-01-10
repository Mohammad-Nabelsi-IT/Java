public class LoopDemo {

    public static void main(String[] args) {

        int x  =10;

        System.out.println(x); // 10

//        x  = x + 20;
        x += 20; // x = x +20
        System.out.println(x); // 30

//        x = x -5 ;
        x -= 5;
        System.out.println(x); // 25

        x *= 10 ;
        // x = x *10;

        System.out.println(x); // 250

        x /= 5;
        System.out.println(x); // 50

        System.out.println("----------------------------");

        for (int i = 10; i <= 100; i+=10) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        int sum =0;
        for (int i = 1; i <=1000 ; i++) {
            sum += i;   // sum = sum + i
        }

        System.out.println(sum);


    }
}
