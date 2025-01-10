public class Main {
    public static void main(String[] args) {
        Electronics e =new Electronics("798","CD player",10.5,2);
        System.out.println(e);
        System.out.println(e.calculateDiscount());
        System.out.println("=============");
        Grosry g =new Grosry("456","cola",2,"10.11.2025");
        System.out.println(g);
        System.out.println(g.calculateDiscount());
    }
}
