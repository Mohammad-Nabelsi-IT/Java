package ChFive;

public class Solve {
    public static void main(String[] args) {
        System.out.printf("(41 ,22 ,71) : %b %n", hasSameLastDigit(41, 22, 71));
        System.out.printf("(41 ,2000 ,71) : %b %n", hasSameLastDigit(41, 2000, 71));
        System.out.printf("(41 ,44 ,88) : %b %n", hasSameLastDigit(41, 44, 88));
        System.out.printf("(41 ,81 ,91) : %b %n", hasSameLastDigit(41, 81, 91));

    }

    public static boolean isValid(int number) {
        return ((number >= 10) && (number <= 1000));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
//        if ((a >= 10 && a <= 100) && (b >= 10 && b <= 100) && (c >= 10 && c <= 1000) {
//
//        }
        if (isValid(a) && isValid(b) && isValid(c)) {
            a %= 10;
            b %= 10;
            c %= 10;
//            return (a == b) || (b == c) || (a == c);
            return (a == b) && (b == c) && (a == c);
        }
        // out the range 10 to 1000
        return false;
    }
}
