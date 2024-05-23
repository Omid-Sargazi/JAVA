package MainLibrary;

public class Librarian extends Person {
    public Librarian(String name, String id) {
        super(name, id);
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }

    public void removeBook(Library library, Book book) {
        library.removeBook(book);
    }

}
