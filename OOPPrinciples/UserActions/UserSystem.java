package OOPPrinciples.UserActions;

public class UserSystem {
    private UserManager userManager;
    private Admin admin;

    public UserSystem() {
        this.userManager = new UserManager();
        this.admin = new Admin("admin", "admin1234");
        userManager.registerUser(admin);
    }

    public void registerMember(String username, String password) {
        Member member = new Member(username, password);
        userManager.registerUser(member);
        admin.addUser(member);
    }

    public void loginUser(String username, String password) {
        User user = userManager.findUserByUsername(username);
        if (user != null) {
            user.login(username, password);
        } else {
            System.out.println("User not found.");
        }
    }

    public void logoutUser(String username) {
        User user = userManager.findUserByUsername(username);
        if (user != null) {
            user.logout();
        } else {
            System.out.println("User not found.");
        }
    }
}
