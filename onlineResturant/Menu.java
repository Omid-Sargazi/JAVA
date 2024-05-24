package onlineResturant;

import java.util.List;
import java.util.ArrayList;

public class Menu {
    private List<FoodItem> foodItems;

    public Menu() {
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public void removeFoodItem(FoodItem foodItem) {
        foodItems.remove(foodItem);
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }
}
