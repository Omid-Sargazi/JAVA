package SOLID.RestaurantFactoryPattern.RestaurantWithFactory;

public class RestaurantSystem {
    private UserFactory userFactory;
    private FoodFactory foodFactory;

    public User addUser(String name, String type) {
        User user = userFactory.createUser(name, type);
        if (user != null) {
            user.showDetails();
        } else {
            System.out.println("Invalid user type");
        }
        return user;
    }

    public void placeOrder(User customer, String foodType) {
        Food food = foodFactory.createFood(foodType);
        if (food != null) {
            Order order = new Order(customer, food);
            order.showOrderDetails();
        } else {
            System.out.println("Invalid food type");
        }
    }
}
