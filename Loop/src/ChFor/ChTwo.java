package ChFor;

public class ChTwo {
    public static void main(String[] args) {
        // call
        DivideNumber();


    }


    /**
     * DivideNumber if number both divide 3 and 5 found sum and stop the first five found
     *
     * @return void
     */
    public static void DivideNumber() {
        // [sum] sum number if divide 3 and 5
        // [count] count number divide 3 and 5
        int sum = 0, count = 0;

        // loop start 1 to 1000
        for (int i = 1; i <= 1000; i++) {
            // check number if divide 3 and 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.printf("Found a match = %d %n ", i);

            }
            // check if count equal 5 stop loops
            if (count == 5) {
                return;
            }

        }
        System.out.printf("sum number divider 3 & 5 = %d %n", sum);
    }
}


// int sum = 0;
// int count = 0;
// for (int i = 1; i <= 1000; i++) {
//     if ((i % 3 == 0) && (i % 5 == 0)) {
//         sum += i;
//         count++;
//         System.out.printf("Found a match = %d %n ", i);
//
//     }
//     if (count == 5) {
//         break;
//     }
//
// }
//
//
// System.out.printf("sum number divider 3 & 5 = %d %n", sum);



