public class Coach extends Person implements Employee {
    private double hour;
    private double hourRate;

    public Coach(double hour, double hourPrice) {
        this.hour = hour;
        this.hourRate = hourPrice;
    }

    public Coach(String name, String gender, double hour, double hourRate) {
        super(name, gender);
        this.hour = hour;
        this.hourRate = hourRate;
    }

    public Coach() {
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourPrice(double hourPrice) {
        this.hourRate = hourPrice;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nhour = " + hour +
                        "\nhourRate = " + hourRate;
    }


    public double totalSalary() {
        return hour * hourRate;
    }
}
