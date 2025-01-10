import shapes.Box;
import shapes.Rect;

public class MainShapes {
    public static void main(String[] args) {
        Rect r = new Rect(10,20);
        System.out.println(r.area());

        System.out.println("---------------");

        Box b = new Box(10,20,15);
        System.out.println(b.area());

    }
}
