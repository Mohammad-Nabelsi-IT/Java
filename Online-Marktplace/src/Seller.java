public class Seller extends User implements Sellable{
    private Product [] listedProduct;
    public Seller(String userName, String email, String password) {
        super(userName, email, password);
    }

    public Seller(String userName, String email, String password, Product[] listedProduct) {
        super(userName, email, password);
        this.listedProduct = listedProduct;
    }

    public Product[] getListedProduct() {
        return listedProduct;
    }

    public void setListedProduct(Product[] listedProduct) {
        this.listedProduct = listedProduct;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nlistedProduct = " + listedProduct;
    }

    @Override
    public void sell() {
        System.out.println("sell");
    }
}
