package shapes;

public class Rect {
    double width;
    double length;

    public Rect(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hi Rect width = " + width + ",length = " + length;

    }

    @Override
    public boolean equals(Object obj) {
        Rect r = (Rect) obj;
        if (this.width == r.width && this.length == r.length) {
            return true;
        } else {
            return false;
        }
    }


}