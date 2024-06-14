package OnlineStore02;

public class Customer extends User {
    private String address;

    public Customer(String userId, String name, String email, String password, String address) {
        super(userId, name, email, password);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
