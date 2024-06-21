package OOPAndLibrary;

import java.util.Map;
import java.util.HashMap;

public class BookService {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(String isbn, String title, String author, String genre) {
        Book newBook = new Book(isbn, title, author, genre);
        books.put(isbn, newBook);
    }

    public void updateBook(String isbn, String title, String author, String genre) {
        Book book = books.get(isbn);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            book.setGenre(genre);
        }
    }

    public void deleteBook(String isbn) {
        books.remove(isbn);
    }

    public Book viewBookDetails(String isbn) {
        return books.get(isbn);
    }

    public void reserveBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
        }
    }

    public void cancelBookReservation(String isbn) {
        Book book = books.get(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
        }
    }

    public void checkOutBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
        }
    }

    public void returnBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
        }
    }

}
