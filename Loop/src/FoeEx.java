public class FoeEx {
    public static void main(String[] args) {
        // initialized variable
        int age = 0;
        double salary = 0.0;
        String name = "";
        boolean isSelected = false;
        char ch = ' ';

        System.out.println(age);
        System.out.println(name);
        System.out.println(isSelected);
        System.out.println(ch);
        System.out.println(salary);


        // call method
        printName();

        // Program to find the sum of natural numbers from 1 to 1000.
        System.out.printf("sum natural number = %d %n", naturalNumber(5, 1000));
        System.out.printf("sum natural number = %d %n", naturalNumber(20, 3000));
        System.out.printf("sum natural number = %d %n", naturalNumber(1000, 5000));


    }

    public static void printName() {
        // i+=2
        // i = i +2;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d Eng Mohamed Elsayed %n", i);
        }
    }

    /**
     * natural number sum number 1 to 1000
     *
     * @return sum natural number type int
     */
    public static int naturalNumber(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }


    // i+=2
    // i = i +2;
    //for (int i = 1; i <=10; i++) {
    // System.out.printf("%d Eng Mohamed Elsayed %n",i);

    //System.out.printf("sum natural number = %d %n", naturalNumber(1000));
    //System.out.printf("sum natural number = %d %n", naturalNumber(3000));
    //System.out.printf("sum natural number = %d %n", naturalNumber(5000));

    // Program to find the sum of natural numbers from 1 to 1000.//        System.out.printf("sum natural number = %d %n",naturalNumber(1000));
    // System.out.printf("sum natural number = %d %n",naturalNumber(3000));
    // System.out.printf("sum natural number = %d %n",naturalNumber(5000));

    /**
     * natural number sum number 1 to 1000
     *
     * @return sum natural number type int
     */
    //public static int naturalNumber(int end) {
    //  int sum = 0;
    //for (int i = 0; i <= end; i++) {
    //  sum += i;
    //}
    //return sum
    //  }

}










