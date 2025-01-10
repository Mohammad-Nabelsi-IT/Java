public class Assaiment {
    public static void main(String[] args) {

        // (=) => Assignment
        int a = 10, b = 20, count = 10;

        // Add & assign
        // count = count +b;
        count += b;
        System.out.println("count : " + count); // 30


        // subtract & assign
        //  a = a - b;
        a -= b;
        System.out.println("a : " + a);// 10

        // Multiply & assign
        //  b =b * count;
        b *= count;
        System.out.println(" b : " + b);//600

        // Divide & assign
        // count  =count / b;
        count /= b; //
        System.out.println("count : " + count);// 0

        // Remainder  & assign
        //  a = a % b; // 590
        System.out.println("a : " + a + ", b: " + b);
        a %= b;
        // -10 % 600 ;
        // 10 % 600;
        // 10 add (-) = -10;

        System.out.println("a : " + a);// -10

        // v.v.v.import
        int result = 10;
        // Implicit cast from 'double' to 'int' in compound assignment can be lossy
        //  result += 5.5;
        System.out.println("resulrt : " + result);

        // solve casting
        result += (int) 5.5;
        System.out.println(" result: " + result);

        int result2 = 20;
        //result2 = result2 + (int) 5.5;
        result2 += (int) 5.5;
        System.out.println("result2 : " + result2);

        result2 += (int) (result2 + 5.5);
        System.out.println("result2: " + result2);


    }
}
