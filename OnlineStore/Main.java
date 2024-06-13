package OnlineStore;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        // Create and add products
        for (int i = 1; i <= 10; i++) {
            store.addProduct(new Product("P" + i, "Product" + i, 10.0 * i));
        }

        // Create and add customers
        Customer customer1 = new Customer("John Doe", "john@example.com", "password1");
        Customer customer2 = new Customer("Jane Smith", "jane@example.com", "password2");
        Customer customer3 = new Customer("Alice Johnson", "alice@example.com", "password3");
        store.addCustomer(customer1);
        store.addCustomer(customer2);
        store.addCustomer(customer3);

        // Create and add stockholders
        Stockholder stockholder1 = new Stockholder("Tom Williams", "tom@example.com", "password4");
        Stockholder stockholder2 = new Stockholder("Sara Brown", "sara@example.com", "password5");
        store.addStockholder(stockholder1);
        store.addStockholder(stockholder2);

        // Customer login
        Customer loggedInCustomer = store.findCustomerByEmail("john@example.com");
        if (loggedInCustomer != null && loggedInCustomer.login("john@example.com", "password1")) {
            System.out.println(loggedInCustomer.getName() + " logged in successfully.");

            // Create an order
            Order order1 = new Order(loggedInCustomer);
            order1.addProduct(store.getProducts().get(0));
            order1.addProduct(store.getProducts().get(1));
            loggedInCustomer.addOrder(order1);

            System.out.println(order1);

            // Change password
            loggedInCustomer.changePassword("password1", "newpassword1");

            // Logout
            loggedInCustomer.logout();
        }

        System.out.println(store);
    }
}
