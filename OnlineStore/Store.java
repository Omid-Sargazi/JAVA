package OnlineStore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    private List<Customer> customers;
    private List<Stockholder> stockholders;

    public Store() {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.stockholders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addStockholder(Stockholder stockholder) {
        stockholders.add(stockholder);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Stockholder> getStockholders() {
        return stockholders;
    }

    public Customer findCustomerByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + products +
                ", customers=" + customers +
                ", stockholders=" + stockholders +
                '}';
    }

}
