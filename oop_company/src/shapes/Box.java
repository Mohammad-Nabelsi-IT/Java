package shapes;

public class Box extends Rect { // Box child => extends Rect parent
    private double height ;
    public  Box(double width , double length , double height){
        super(width, length); // call the parent constructor Rect(double width, double length) must be first line
        this.height = height;
    }
    public  double area(){ // override area method from Rect class
        return  2 * getLength() * this.getWidth() +
                2 * this.getWidth() * this.height +
                2 * this.getLength() * this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
