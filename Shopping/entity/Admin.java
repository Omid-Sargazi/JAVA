package Shopping.entity;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("Admin [Username=" + getUsername() + "]");
    }
}
