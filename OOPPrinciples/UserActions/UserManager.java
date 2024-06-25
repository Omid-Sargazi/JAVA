package OOPPrinciples.UserActions;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println(user.getUserName() + " registered on " + user.getRegistrationDate());
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean isUserMember(String username) {
        User user = findUserByUsername(username);
        return user != null && user instanceof Member;
    }
}
