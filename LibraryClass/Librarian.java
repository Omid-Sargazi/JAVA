package LibraryClass;

public class Librarian extends User {
    public Librarian(String username, String email, String password) {
        super(username, email, password);
        setRole("librarian");
    }
}
