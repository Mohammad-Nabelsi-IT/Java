public class Car extends Vehicle {
    private String make;
    private String model;
    public Car(String vehicleId, double rentalRate) {
        super(vehicleId, rentalRate);
    }

    @Override
    public double calculateRentalCost(int hour) {
    return hour*getRentalRate();
    }

    public Car(String vehicleId, double rentalRate, String make, String model) {
        super(vehicleId, rentalRate);
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString()+"Car" +
                "\nmake = " + make +
                "\nmodel = " + model ;
    }
}

