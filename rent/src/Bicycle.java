public class Bicycle extends Vehicle {
  private int gearCount;

    public Bicycle(String vehicleId, double rentalRate, int gearCount) {
        super(vehicleId, rentalRate);
        this.gearCount = gearCount;
    }

    @Override
    public double calculateRentalCost(int hour){
        return getRentalRate()*hour*0.7;
    }

    @Override
    public String toString() {
        return super.toString()+"Bicycle" +
                "gearCount = " + gearCount;
    }
}
