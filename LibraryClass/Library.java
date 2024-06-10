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

    public void updateUserProfile(int userID, String newEmail, String firstName, String lastName) {
        User user = loggedInUsers.get(userID);
        if (user != null) {
            user.setEmail(newEmail);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            System.out.println("User profile updated successfully.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

    public void changePassword(int userID, String currentPassword, String newPassword) {
        User user = loggedInUsers.get(userID);
        if (user != null && user.getPassword().equals(currentPassword)) {
            user.setPassword(newPassword);
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect current password or user is not logged in.");

        }
    }

    public void resetPassword(int userId, String email) {
        User user = users.get(email);
        if (user != null && user.getEmail().equals(email)) {
            user.setPassword("defaultPassword");
            System.out.println("Password reset successfully. Default password is 'defaultPassword'.");
        } else {
            System.out.println("User not found or email mismatch.");
        }
    }

    public void deleteUserAccount(int userID) {
        User user = loggedInUsers.get(userID);
        if (user != null) {
            users.remove(user.getUsername());
            loggedInUsers.remove(userID);
            System.out.println("User account deleted successfully.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

}
