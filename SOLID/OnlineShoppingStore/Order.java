package SOLID.OnlineShoppingStore;

public class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return product.getPrice() * quantity;
    }
}
