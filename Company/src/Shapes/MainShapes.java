package Shapes;

public class MainShapes {
    public static void main(String[] args) {
        Rect rect = new Rect(50,60);
        System.out.println(rect.area());
        System.out.println("--------------------");
        Box b =new Box(40,50,90);
        System.out.println(b.area());
    }
}
