public class Grosry extends Product {
    private String expirationDate;

    public Grosry(String productId, String productName, double price, String expirationDate) {
        super(productId, productName, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.8;
    }

    @Override
    public String toString() {
        return super.toString()+"Grosry" +
                "\nexpirationDate = " + expirationDate;
    }
}
