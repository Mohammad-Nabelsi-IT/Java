package Shapes;

public class Box {
    private int width, length, height;
    private Box(){
        count++;
    }
    public Box(int width, int length, int height) {
        this();
        this.width = width;
        this.length = length;
        this.height = height;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume() {
        return this.width * this.length * this.height;
    }
    public static int count;

    public static final String COMPANY="Mohammad,N";


}
