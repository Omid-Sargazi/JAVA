package Shopping.boundary;

import Shopping.controller.UserController;
import Shopping.entity.Admin;
import Shopping.entity.User;
import Shopping.entity.Customer;

public class UserBoundary {
    private UserController userController;

    public UserBoundary(UserController userController) {
        this.userController = userController;
    }

    public void registerUsers() {
        userController.registerUser(new Customer("Customer1", "Password1"));
        userController.registerUser(new Admin("Omid", "Password1234"));
    }

    public void login(String username, String password) {
        if (userController.loginUser(username, password)) {
            System.out.println(username + " logged in successfully.");
        } else {
            System.out.println("Login failed.");
        }
    }

    public void logout() {
        userController.logoutUser();
        System.out.println("User logged out successfully.");
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (userController.changePassword(oldPassword, newPassword)) {
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Password change failed.");

        }
    }

    public void showLoggedInUserDetails() {
        User user = userController.getLoggedInUser();
        if (user != null) {
            user.showDetails();
        } else {
            System.out.println("No user is logged in.");
        }
    }
}
