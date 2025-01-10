package Shapes;

public class Rect {
    private double width;
    private double length;

    public Rect(double width, double length) {
        this.width = width;
        this.length = length;
    }

//    public double getWidth() {
//        return width;
//    }

    public void setWidth(double width) {
        this.width = width;
    }

//    public double getLength() {
//        return length;
//    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area() {
        return this.width * this.length;
    }
}
