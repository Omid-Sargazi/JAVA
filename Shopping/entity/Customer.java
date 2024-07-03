package Shopping.entity;

public class Customer extends User {
    private ShoppingCart shoppingCart;

    public Customer(String username, String password) {
        super(username, password);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub

        System.out.println("Customer [Username=" + getUsername() + "]");

    }
}
