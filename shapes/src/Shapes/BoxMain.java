package Shapes;

public class BoxMain {
    public static void main(String[] args) {
        System.out.println(Box.count);
        Box b =new Box(10,15,20);
        System.out.println(b.volume());
        System.out.println(Box.count);
        Box b1 =new Box(15,50,60);
        System.out.println(b1.volume());
        System.out.println(Box.count);
        System.out.println(Box.COMPANY);
        Box b3=new Box(100,200,300);
        System.out.println(b3.volume());
        System.out.println(Box.count);
    }
}
