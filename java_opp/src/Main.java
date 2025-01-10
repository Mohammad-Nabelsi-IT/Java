public class Main {

    public static void main(String[] args) {
        // Define object from your class

        Rect r1 = new Rect(); // call class default constructor
        r1.width =10;
        r1.length = 5;
        r1.color ="red";

        System.out.println(r1.area());
        System.out.println(r1.color);

        Rect r2 = new Rect();
        r2.length = 500;
        r2.width = 700;
        r2.color ="green";

        System.out.println(r2.area());


        Rect r3 = new Rect();
        r3.length = 7;
        System.out.println(r3.width);
        System.out.println(r3.length);
        System.out.println(r3.area());

        System.out.println("---------------");
        // using the parameter constructor

        Rect r4 = new Rect(5);
        System.out.println(r4.area());

        Rect r5 = new Rect(14,18);
        System.out.println(r5.area());

        Rect r6 = new Rect(17,20,"pink");
        System.out.println(r6.area());
        System.out.println(r6.color);

    }

}
