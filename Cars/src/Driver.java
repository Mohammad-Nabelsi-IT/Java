public class Driver extends Person {

    private double drivingLicence;
    public Driver(String name, String gender) {
        super(name, gender);
    }

    public Driver(String name, String gender, double drivingLicence) {
        super(name, gender);
        this.drivingLicence = drivingLicence;
    }

    public double getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(double drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    @Override
    public String toString() {
        return super.toString()+
                "drivingLicence = " + drivingLicence;
    }
}
