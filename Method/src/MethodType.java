public class MethodType {
    public static void main(String[] args) {
        sum();
        myinfo();
        avg();
    }

    // sum two numbers
    public static void sum() {
        // ... code
        int x = 10, y = 50;
        int res = x + y;
        System.out.println("result =" + res);
        System.out.println("hi");
    }

    public static void myinfo() {
        System.out.println("name : Mohammad Nabelsi, age : 33");
    }

    // avg average student grade
    // return
    public static int avg() {
        int g1 = 95, g2 = 90, g3 = 100;
        int result = (g1 + g2 + g3) / 3;
        return result;
    }

}

