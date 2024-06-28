package SOLID.LibrarySystem;

public class LibrarySystem {
    public User createUser(String name, String type) {
        if (type.equals("Member")) {
            return new User(name, "Member");
        } else if (type.equals("Librarian")) {
            return new User(name, "Librarian");
        } else {
            return null;
        }
    }
}
