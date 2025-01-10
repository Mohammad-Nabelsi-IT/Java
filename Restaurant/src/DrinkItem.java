public class DrinkItem extends MenuItem{
    private double volume;
    public DrinkItem(int itemId, String name, double price, String category) {
        super(itemId, name, price, category);
    }

    public DrinkItem(int itemId, String name, double price, String category, double volume) {
        super(itemId, name, price, category);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+
                "volume=" + volume +
                '}';
    }
}
