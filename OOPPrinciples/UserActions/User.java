package OOPPrinciples.UserActions;

import java.util.Date;

abstract class User implements UserActions {
    protected String userName;
    protected String password;
    protected boolean isLoggedIn;
    protected Date registrationDate;

    public User(String username, String password) {
        this.userName = username;
        this.password = password;
        this.registrationDate = new Date();
        this.isLoggedIn = false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        // TODO Auto-generated method stub
        if (this.userName.equals(username) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println(username + " has logged in.");

        } else {
            System.out.println("Invalid credentials.");
        }
    }

    @Override
    public void logout() {
        // TODO Auto-generated method stub
        isLoggedIn = false;
        System.out.println(userName + " has logged out.");
    }

}
