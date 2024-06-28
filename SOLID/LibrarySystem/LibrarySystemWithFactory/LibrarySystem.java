package SOLID.LibrarySystem.LibrarySystemWithFactory;

public class LibrarySystem {
    private UserFactory userFactory;

    public LibrarySystem(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public void addUser(String name, String type) {
        User user = userFactory.createUser(name, type);
        if (user != null) {
            user.showDetails();
        } else {
            System.out.println("Invalid user type");
        }
    }
}
