package shapes;

public class Box extends Rect {
    double height;

    public Box(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Hi Box " +
                "width = " + width +
                ", length = " + length +
                ", height = " + height ;
    }
}
