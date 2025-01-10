package shapes;

public class Main {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.width = 10;
        r.length = 15;

        Rect r2 = new Rect();
        r2.width = 4;
        r2.length = 7;

        System.out.println( r.toString()); // r.toString() shapes.Rect@1b28cdfa
        System.out.println("-----------");
        System.out.println( r2); // r2.toString()

        System.out.println("===========");
        Box b = new Box();
        b.width = 10;
        b.length = 14;
        b.height = 12;

        System.out.println(b); //  b.toString()
//        System.out.println( r.equals(r2));
    }
}
