public class Electro extends Product{
    private String brand;
    private int size;
    public Electro(String productName, double price) {
        super(productName, price);
    }

    public Electro(String productName, double price, String brand, int size) {
        super(productName, price);
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nbrand = " + brand +
                "\nsize = " + size;
    }
}
