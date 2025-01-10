package shapes;

public class Box extends Rect {
    double height;
    public String toString() { //override toString => class Object
         return super.toString() + "\nheight \t:" + this.height ;
    }
}
