package OOPPrinciples.UserActions;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<User> manageUsers;

    public Admin(String username, String password) {
        super(username, password);
        this.manageUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        manageUsers.add(user);
    }

    public void removeUser(User user) {
        manageUsers.remove(user);
        System.out.println(user.getUserName() + " removed by Admin.");
    }
}
