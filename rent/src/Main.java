public class Main {
    public static void main(String[] args) {
        Car c = new Car("123465", 10, "Ford", "Fista");
        System.out.println(c);
        System.out.println(c.calculateRentalCost(5));
        System.out.println("===========");
        Bicycle b =new Bicycle("456789",3,3);
        System.out.println(b);
        System.out.println(b.calculateRentalCost(10));

    }
}
