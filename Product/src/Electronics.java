public class Electronics extends Product{
    private int warrantyPeriod;

    public Electronics(String productId, String productName, double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*0.1;
    }

    @Override
    public String toString() {
        return super.toString()+ "Electronics" +
                "\nwarrantyPeriod = " + warrantyPeriod ;
    }
}
