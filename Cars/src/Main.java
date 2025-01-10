public class Main {
    public static void main(String[] args) {
        Car c =new Car("BMW","M5",new Engine(350,400));
        System.out.println(c);
        System.out.println("===========================");
        Engine e =new Engine(1000,1000 );
        Driver d =new Driver("Ahmad","Male" ,544545);
        Car c1 =new Car("Audi","A7",5,5,e ,d );
        System.out.println(c1);
        System.out.println("===========================");

    }
}
