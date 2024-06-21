package OOPAndLibrary;

import java.util.Map;
import java.util.HashMap;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void registerUser(String userId, String name, String email, String password) {
        User newUser = new User(userId, name, email, password);
        users.put(userId, newUser);
    }

    public User login(String userId, String password) {
        User user = users.get(userId);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void updateUserProfile(String userId, String name, String email) {
        User user = users.get(userId);
        if (user != null) {
            user.setName(name);
            user.setEmail(email);
        }
    }

    public void changePassword(String userId, String newPassword) {
        User user = users.get(userId);
        if (user != null) {
            user.setPassword(newPassword);
        }
    }
}
