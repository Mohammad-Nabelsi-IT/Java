public class Main {
    public static void main(String[] args) {
        Rect r = new Rect(10, 20);

        System.out.println("Rect Area is " + r.area());
        System.out.println("Rect Primeter is "+r.prim());
        System.out.println("=========================");
        Circle c = new Circle(2);
        System.out.println("Circle Area is " + c.area());
        System.out.println("Circle Primeter is "+c.prim());
    }
}
