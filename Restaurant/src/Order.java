public class Order {
    Customer customers;
    DrinkItem drinkItem;
    FoodItem foodItem;
    DessertItem dessertItem;
    MenuItem menuItem;
    int qty;

    public Order(Customer customers, DrinkItem drinkItem, FoodItem foodItem, DessertItem dessertItem, MenuItem menuItem, int qty) {
        this.customers = customers;
        this.drinkItem = drinkItem;
        this.foodItem = foodItem;
        this.dessertItem = dessertItem;
        this.menuItem = menuItem;
        this.qty = qty;
    }

    public Order(Customer customer, MenuItem menuItem, int qty) {
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public DrinkItem getDrinkItem() {
        return drinkItem;
    }

    public void setDrinkItem(DrinkItem drinkItem) {
        this.drinkItem = drinkItem;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public DessertItem getDessertItem() {
        return dessertItem;
    }

    public void setDessertItem(DessertItem dessertItem) {
        this.dessertItem = dessertItem;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return
                "customers=" + customers +
                ", drinkItem=" + drinkItem +
                ", foodItem=" + foodItem +
                ", dessertItem=" + dessertItem +
                ", menuItem=" + menuItem +
                ", qty=" + qty +
                '}';
    }
}