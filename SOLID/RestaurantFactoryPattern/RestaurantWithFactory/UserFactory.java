package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class UserFactory {
    public User createUser(String name, String type) {
        if (type.equalsIgnoreCase("Customer")) {
            return new Customer(name);
        } else if (type.equalsIgnoreCase("Owner")) {
            return new Owner(name);
        } else {
            return null;
        }
    }
}
