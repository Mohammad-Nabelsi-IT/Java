public class Main {
    public static void main(String[] args) {
        Animal a =new Animal("dolphin","aquatic");
        a.eat();
        a.move();
        System.out.println(a);
        System.out.println("===================");
        Plant p =new Plant("flower");
        p.eat();
        p.move();
        System.out.println(p);
    }
}
