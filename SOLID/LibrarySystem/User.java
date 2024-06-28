package SOLID.LibrarySystem;

public class User {
    private String name;
    private String type;

    public User(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void showDetails() {
        System.out.println("User: " + name + ", Type: " + type);
    }
}
