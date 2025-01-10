public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double prim() {
        return 2*Math.PI*radius;
    }
}
