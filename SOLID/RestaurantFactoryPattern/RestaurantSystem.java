package SOLID.RestaurantFactoryPattern;

public class RestaurantSystem {
    public User addUser(String name, String type) {
        if (type.equalsIgnoreCase("Customer")) {
            return new Customer(name);
        } else if (type.equalsIgnoreCase("Owner")) {
            return new Owner(name);
        } else {
            System.out.println("Invalid user type");
            return null;
        }
    }

    public void placeOrder(User customer, String foodType) {
        Food food = null;
        if (foodType.equalsIgnoreCase("Pizza")) {
            food = new Pizza();
        } else if (foodType.equalsIgnoreCase("Salad")) {
            food = new Salad();
        } else if (foodType.equalsIgnoreCase("Burger")) {
            food = new Burger();
        } else {
            System.out.println("Invalid food type");
        }

        if (food != null) {
            Order order = new Order(customer, food);
            order.showOrderDetails();
        }
    }
}