package SOLID.OnlineShoppingStore;

public class OnlineShoppingStore {
    public static void main(String[] args) {
        Product product1 = new Product("LAptop", 1000);
        Product product2 = new Product("SmartPhone", 500);

        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart();
        cart.addOrder(product2, 1);
        cart.addOrder(product1, 2);
        System.out.println("Total Price  " + cart.calculateTotalPrice());
    }
}
