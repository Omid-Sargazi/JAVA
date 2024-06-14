package OnlineStore02;

import java.util.List;

public class ShoppingCart {
    private String cartId;
    private Customer customer; // Association
    private List<Product> productList; // Aggregation

    public ShoppingCart(String cartId, Customer customer, List<Product> productList) {
        this.cartId = cartId;
        this.customer = customer;
        this.productList = productList;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ShoppingCart [cartId=" + cartId + ", customer=" + customer + ", productList=" + productList
                + ", getCartId()=" + getCartId() + ", getCustomer()=" + getCustomer() + ", getProductList()="
                + getProductList() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
}
