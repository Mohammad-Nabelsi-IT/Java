package Program;

import Shapes.Rect;

public class MainRect {
    public static void main(String[] args) {
        Rect r = new Rect(10, 20);
        System.out.println(r.area());
        r.setWidth(5);
        //System.out.println(r.getWidth());
        r.setLength(30);
        //System.out.println(r.getLength());

        System.out.println(r.area());

    }
}
