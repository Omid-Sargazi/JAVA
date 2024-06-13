package OnlineStore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.orderId = UUID.randomUUID().toString();
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{orderId='" + orderId + "', customer=" + customer + ", products=" + products + "}";
    }
}
