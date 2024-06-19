package SOLID.OnlineShoppingStore;

public class OrderSOLID {
    private Product product;
    private int quantity;

    public OrderSOLID(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product geProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
