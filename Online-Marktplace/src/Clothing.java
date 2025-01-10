public class Clothing extends Product{
    private String brand;
    private int size;
    private String color;

    public Clothing(String productName, double price) {
        super(productName, price);
    }

    public Clothing(String productName, double price, String brand, int size, String color) {
        super(productName, price);
        this.brand = brand;
        this.size = size;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbrand = " + brand +
                "\nsize = " + size +
                "\ncolor = " + color;
    }
}
