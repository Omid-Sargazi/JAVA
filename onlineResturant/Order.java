package onlineResturant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<FoodItem> foodItems;

    public Order(Customer customer) {
        this.customer = customer;
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public void removeFoodItem(FoodItem foodItem) {
        foodItems.remove(foodItem);
    }

    public double getTotalPrice() {
        double total = 0;
        for (FoodItem item : foodItems) {
            total += item.getPrice();
        }
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }
}
