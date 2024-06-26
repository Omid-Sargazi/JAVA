package OOPLibrary;

public class Librarian extends User {
    public Librarian(String username, String password) {
        super(username, password);
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("Book " + book.getTitle() + " added to the library by " + username);
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println("Book " + book.getTitle() + " removed from the library by " + username);
    }
}
