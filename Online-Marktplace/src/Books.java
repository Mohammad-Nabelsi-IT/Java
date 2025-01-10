public class Books extends Product{
   private String brand;
   private String author;
   private String category;

    private Books(String productName, double price) {
        super(productName, price);
    }

    public Books(String productName, double price, String brand, String author, String category) {
        super(productName, price);
        this.brand = brand;
        this.author = author;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category=category;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nbrand = " + brand +
                "\nauthor = " + author +
                "\ncategory = " + category ;
    }
}
