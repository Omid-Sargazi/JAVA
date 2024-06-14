package OnlineVisit;

import java.util.List;

public abstract class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private int id;
    private String name;
    private boolean isLoggedIn;

    public User(int userId, String username, String password, String email, int id, String name) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
        this.name = name;
        this.isLoggedIn = false;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void register() {
        System.out.println(username + " registered successfully.");
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public static User register(List<User> users, String username, String password, String email, String role) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                user.setLoggedIn(true);
                System.out.println("Login successful.");
                return user;
            }
        }
        System.out.println("Invalid username or password.");
        return null;
    }

    public void logout() {
        if (this.isLoggedIn) {
            this.setLoggedIn(false);
            System.out.println("Logout successful.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.setPassword(newPassword);
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Old password is incorrect.");
        }
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
                + ", id=" + id + ", role=" + getRole() + "]";
    }

}
