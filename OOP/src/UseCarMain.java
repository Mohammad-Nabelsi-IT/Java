public class UseCarMain {
    public static void main(String[] args) {
        Car one = new Car();
        one.model = "BMW E60";
        one.color = "Silver";
        one.doors = 5;
        one.hp = 360;
        one.move();
        one.stop();
        ///////////////////////
        Car two = new Car();
        one.model = "MAZDA 3";
        one.color = "Black";
        one.doors = 3;
        one.hp = 150;
        one.move();
        one.stop();

        Car one1 = new Car();
         one1.move();

        Car c3 =new Car("Audi","White",400,4);
        c3.move();
        c3.stop();


    }
}
