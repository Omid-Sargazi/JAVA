package LibraryClass;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, User> users;
    private Map<String, Admin> admins;
    private Map<String, Librarian> librarians;
    private Map<Integer, User> loggedInUsers;

    public Library() {
        users = new HashMap<>();
        admins = new HashMap<>();
        librarians = new HashMap<>();
        loggedInUsers = new HashMap<>();
    }

    // User Management
    public User registerUser(String username, String password, String email) {
        if (users.containsKey(username)) {
            System.out.println("Username already exists.");
            return null;
        }
        User user = new User(username, email, password);
        users.put(username, user);
        System.out.println("User registered successfully.");
        return user;
    }

    public void login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            loggedInUsers.put(user.getUserID(), user);
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void logout(int userID) {
        if (loggedInUsers.containsKey(userID)) {
            loggedInUsers.remove(userID);
            System.out.println("User logged out successfully.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

}
