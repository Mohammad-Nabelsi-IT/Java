public class Buyer extends User implements Buyable{
   private Product [] purchaseHistory;
    public Buyer(String userName, String email, String password) {
        super(userName, email, password);
    }

    public Buyer(String userName, String email, String password, Product[] purchaseHistory) {
        super(userName, email, password);
        this.purchaseHistory = purchaseHistory;
    }

    public Product[] getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(Product[] purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npurchaseHistory = " + purchaseHistory;
    }

    @Override
    public void buy() {
        System.out.println("buy");
    }
}
