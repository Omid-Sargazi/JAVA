package librarySystem;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String name;
    private List<Book> books;

    public Publisher(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return this.books;
    }

    @Override
    public String toString() {
        return "Publisher: " + this.name + " has published " + this.books.size() + " books.";
    }
}
