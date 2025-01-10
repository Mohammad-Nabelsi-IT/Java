public class Demo2 {
    public static void main(String[] args) {
       // nested loop
        for (int x = 1; x <= 10 ; x++) {
            int table =x;
            for (int i = 1; i <=10; i++) {
                System.out.println( table + " x " + i + " = " +  ( table * i));
            }
            System.out.println("********");
        }
    }
}
