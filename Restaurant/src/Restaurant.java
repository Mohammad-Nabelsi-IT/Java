
import java.util.Arrays;

public class Restaurant {
    MenuItem[] menuItems;
    Customer[] customers;

    public Restaurant() {
        menuItems = new MenuItem[5];
        customers = new Customer[3];
    }

    public class MenuManager {
        public boolean addItem(MenuItem menuItem) {
            for (int i = 0; i < menuItems.length; i++) {
                if (menuItems[i] == null) {
                    menuItems[i] = menuItem;
                    return true;
                }
            }
            return false;
        }

        public boolean removeItem(int itemId) {
            for (int i = 0; i < menuItems.length; i++) {
                if (menuItems[i] != null && menuItems[i].getItemId() == itemId) {
                    menuItems = null;
                    return true;
                }
            }
            return false;
        }
    }

    public class CustomerManager {
        public boolean addItem(Customer customer) {
            for (int i = 0; i < customers.length; i++) {
                if (customers[i] == null) {
                    customers[i] = customer;
                    return true;
                }
            }
            return false;
        }

        public boolean removeItem(Customer customer) {
            for (int i = 0; i < customers.length; i++) {
                if (customers[i] != null && customers[i].getName().equals(customer)) {
                    customers = null;
                    return true;
                }
            }
            return false;
        }
    }


    public class OrderManager implements Orderable, Billable {
        @Override
        public double generateBill(Order order) {
            return order.qty * order.menuItem.getPrice();
        }


        public Order placeOrder(Customer customer, MenuItem menuItem, int qty) {
            Order or = new Order(customer, menuItem, qty);
            return or;
        }

    }

    public Restaurant(MenuItem[] menuItems, Customer[] customers) {
        this.menuItems = menuItems;
        this.customers = customers;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return
                "menuItems=" + Arrays.toString(menuItems) +
                        ", customers=" + Arrays.toString(customers) +
                        '}';
    }
}
