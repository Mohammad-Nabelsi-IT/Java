public class Coach extends Employee {
    private double hour;
    private double hourPrice;

    public Coach() {
        System.out.println("Coach Create");
    }

    @Override
    public double totalSalary() {
        return this.hour * this.hourPrice + getSalary();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }
}
