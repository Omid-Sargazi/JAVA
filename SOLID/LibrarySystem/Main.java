package SOLID.LibrarySystem;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        User member = librarySystem.createUser("Alice", "Member");
        User librarian = librarySystem.createUser("Bob", "Librarian");
        if (member != null)
            member.showDetails();
        if (librarian != null)
            librarian.showDetails();
    }
}
