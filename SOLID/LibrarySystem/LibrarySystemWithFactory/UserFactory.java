package SOLID.LibrarySystem.LibrarySystemWithFactory;

public class UserFactory {
    public User createUser(String name, String type) {
        if (type.equals("Member")) {
            return new Member(name);
        } else if (type.equals("Librarian")) {
            return new Librarian(name);
        } else {
            return null;
        }
    }

}
