public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Customer c1 = new Customer(123, "Mohammad", "123456", "58.69.1");
        Customer c2 = new Customer(321, "Ahmad", "654000", "12.12.13");
        Customer c3 = new Customer(654, "Lara", "2020220", "13.13.13");

        DessertItem d1 = new DessertItem(123, "teramiso", 5.5, "italian Dessert");
        DessertItem d2 = new DessertItem(111, "Baklawa", 15, "Arabic Dessert");
        DessertItem d3 = new DessertItem(545, "Mamool", 12, "Arabic Dessert");

        FoodItem f1 = new FoodItem(33, "Fooll", 3.5, "Arabic Food");
        FoodItem f2 = new FoodItem(221, "Shawrma", 5, "Arabic Food");
        FoodItem f3 = new FoodItem(141, "Falafel", 2.5, "Arabic Food");

        DrinkItem dr1 = new DrinkItem(121, "Tee", 1.5, "International Drink");
        DrinkItem dr2 = new DrinkItem(102, "Melissa", 2, "International Drink");
        DrinkItem dr3 = new DrinkItem(545, "Mint", 1.5, "International Drink");

        Restaurant.MenuManager rm = r.new MenuManager();
        rm.addItem(d1);
        rm.addItem(d2);
        rm.addItem(d3);



        Restaurant.OrderManager om = r.new OrderManager();
        Order o1 = om.placeOrder(c1, d1, 3);
        System.out.println(om.generateBill(o1));
    }
}
