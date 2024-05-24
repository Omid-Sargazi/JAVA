package onlineResturant;

public class Mian {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Businessperson bp = new Businessperson("admin", "admin123");

        FoodItem pizza = new FoodItem("Pizza", 12.99, "Delicious cheese pizza");
        FoodItem burger = new FoodItem("Burger", 8.99, "Juicy beef burger");

        restaurant.getMenu().addFoodItem(pizza);
        restaurant.getMenu().addFoodItem(burger);

        Customer customer = new Customer("john_doe", "password123");
        restaurant.getCustomerList().addCustomer(customer);

        Order order = new Order(customer);
        order.addFoodItem(pizza);
        order.addFoodItem(burger);

        System.out.println("Order placed by: " + order.getCustomer().getUsername());
        System.out.println("Total price: $" + order.getTotalPrice());

    }

}
