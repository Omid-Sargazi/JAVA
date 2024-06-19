package SOLID.RestaurantManagement;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<MenuItem> menuItems = new ArrayList<>();

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : menuItems) {
            total += item.price;
        }
        return total;
    }
}
