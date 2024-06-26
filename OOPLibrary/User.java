package OOPLibrary;

import java.util.Date;

public abstract class User implements UserActions {
    protected String username;
    protected String password;
    protected boolean isLoggedIn;
    protected Date registrationDate;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.registrationDate = new Date();
        this.isLoggedIn = false;
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

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println(username + " has logged in.");
        } else {
            System.out.println("Invalid credentials.");
        }

    }

    @Override
    public void logout() {
        isLoggedIn = false;
        System.out.println(username + " has logged out.");
    }

}
