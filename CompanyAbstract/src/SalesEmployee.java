public class SalesEmployee extends Employee{

    private double commission;
    private double target;
    private double collectionAmount;

    public SalesEmployee() {
        System.out.println("SalesEmployee Create");
    }

    @Override
    public double totalSalary() {
        if (collectionAmount>=target){
            return this.getSalary()+this.collectionAmount*this.commission;
        }else {
            return this.getSalary();
        }
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }
}
