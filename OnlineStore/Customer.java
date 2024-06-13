package OnlineStore;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Order> orders;

    public Customer(String name, String email, String password) {
        super(name, email, password);
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() + ", orders=" + orders + "}";
    }
}
