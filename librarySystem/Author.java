package librarySystem;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;// association

    public Author(String name) {
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
        return "Author: " + this.name + " has written " + this.books.size() + " books.";
    }
}
