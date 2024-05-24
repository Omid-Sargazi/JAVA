package onlineResturant;

public class Restaurant {
    private Menu menu;
    private CustomerList customerList;

    public Restaurant() {
        this.menu = new Menu();
        this.customerList = new CustomerList();
    }

    public Menu getMenu() {
        return menu;
    }

    public CustomerList getCustomerList() {
        return customerList;
    }

}
