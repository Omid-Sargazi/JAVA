package OOPLibrary;

import java.util.List;
import java.util.ArrayList;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println(user.getUsername() + " registered on " + user.getRegistrationDate());
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean isUserMember(String username) {
        User user = findUserByUsername(username);
        return user != null && user instanceof Member;
    }

    public boolean isUserLibrarian(String username) {
        User user = findUserByUsername(username);
        return user != null && user instanceof Librarian;
    }
}
