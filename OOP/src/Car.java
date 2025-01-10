public class Car {
    String color;
    String model;
    int hp;
    int doors;

    void move() {
        System.out.println("Hi my model is " + model + " Im moving with " + hp + " Horse Power my Color " + color + " with " + doors + " Doors");
    }

    void stop() {
        System.out.println(" STOP ");
    }

    Car() {
        model = "---";
        color = "---";
        hp = 0;
        doors = 0;
    }

    Car(String model, String color, int hp, int doors) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.doors = doors;
    }
}
