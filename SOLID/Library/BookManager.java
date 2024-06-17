package SOLID.Library;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<String> books = new ArrayList<>();
    private List<String> lentBooks = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public boolean isBookAvailable(String book) {
        return books.contains(book);
    }

    public void lendBook(String book) {
        books.remove(book);
        lentBooks.add(book);
    }

    public void returnBook(String book) {
        lentBooks.remove(book);
        books.add(book);
    }
}
