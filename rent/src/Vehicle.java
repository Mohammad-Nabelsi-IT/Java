public abstract class Vehicle {
    private String vehicleId;
    private double rentalRate;

    public Vehicle(String vehicleId, double rentalRate) {
        this.vehicleId = vehicleId;
        this.rentalRate = rentalRate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int hour);

    @Override
    public String toString() {
        return
                "\n vehicleId = " + vehicleId +
                "\n rentalRate = " + rentalRate ;
    }
}

