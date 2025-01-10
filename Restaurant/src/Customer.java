import java.util.Arrays;

public class Customer {
    private int customerId;
    private String name;
    private String contact;
    private String orderHistory;

    public Customer(int customerId, String name, String contact, String orderHistory) {
        this.customerId = customerId;
        this.name = name;
        this.contact = contact;
        this.orderHistory = orderHistory;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(String orderHistory) {
        this.orderHistory = orderHistory;
    }

    @Override
    public String toString() {
        return
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", orderHistory=" + orderHistory +
                '}';
    }
}
