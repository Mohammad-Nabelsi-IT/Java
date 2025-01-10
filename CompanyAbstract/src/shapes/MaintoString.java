package shapes;

public class MaintoString {
    public static void main(String[] args) {
        Rect r=new Rect(11,10);
        System.out.println(r);
        System.out.println("================");
        Box b =new Box(50,100,20);
        System.out.println(b);
        System.out.println("================");
        Rect r1=new Rect(10,10);
        System.out.println(r.equals(r1));
    }
}
