package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class FoodFactory {
    public Food createFood(String type) {
        if (type.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("Salad")) {
            return new Salad();
        } else if (type.equalsIgnoreCase("Burger")) {
            return new Burger();
        } else {
            return null;
        }
    }
}
