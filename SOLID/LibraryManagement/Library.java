package SOLID.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public int getTotalBooks() {
        return books.size();
    }
}
