package SOLID.RestaurantManagement;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new MenuItem("Pizza", 12));
        order.addItem(new MenuItem("Burger", 8));

        System.out.println("Total Price: " + order.calculateTotal());
    }
}
