package SOLID.LibrarySystem.LibrarySystemWithFactory;

public class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("User: " + name + ", Type: Librarian");
    }
}
