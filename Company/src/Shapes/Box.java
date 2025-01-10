package Shapes;

public class Box extends Rect {
    private double height;

    public Box(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double area() {
        return 2 * getWidth() * getLength()
                + 2 * getWidth() * height
                + 2 * getLength() * height;
    }

}
