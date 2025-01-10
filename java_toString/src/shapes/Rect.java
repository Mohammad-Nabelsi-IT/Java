package shapes;

public class Rect { // extends Object
    double width;
    double length;


    public String toString() { //override toString => class Object
//        return "I am Rect my width = " + this.width + " and My length = " + this.length;
//        return "Rect{width = " + this.width + " ,length = " + this.length + "}";
        return "width \t:" + this.width + "\nlength \t:" + this.length ;
    }
}
