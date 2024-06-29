package ECommerceSystem;

public class Customer extends User {

    public Customer(String username, String email) {
        super(username, email);
    }

    @Override
    public void purchase(Product product) {
        // TODO Auto-generated method stub
        System.out.println(getUsername() + " purchased " + product.getName());
    }

}