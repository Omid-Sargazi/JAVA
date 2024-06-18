package SOLID.OnlineShopping;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Order order : orders) {
            total += order.calculateTotalPrice();
        }
        return total;
    }
}