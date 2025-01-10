package Shapes;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
       return r;
    }
    public double area (){
        return Math.PI * Math.pow(this.r, 2);
    }


}
