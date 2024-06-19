package SOLID.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Product product, int quantity) {
        orders.add(new Order(product, quantity));
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Order order : orders) {
            total += order.calculateTotalPrice();
        }
        return total;
    }
}
