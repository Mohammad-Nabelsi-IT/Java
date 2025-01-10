public class Car {
    private String brand;
    private String model;
    private int setNumber;
    private int doorNumber;
    private Engine engine;
    private Driver driver;

    public Car(String brand, String model, int setNumber, int doorNumber, Engine engine, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.setNumber = setNumber;
        this.doorNumber = doorNumber;
        this.engine = engine;
        this.driver = driver;
    }

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public Car(String brand, String model, Engine engine, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return
                "brand = " + brand +
                        "\nmodel = " + model +
                        "\nsetNumber = " + setNumber +
                        "\ndoorNumber = " + doorNumber +
                        "\nengine = " + engine +
                        "\ndriver = " + driver;
    }
}
