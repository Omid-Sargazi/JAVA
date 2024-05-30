package librarySystem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Book> loanBooks;

    public Person(String name) {
        this.name = name;
        this.loanBooks = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public List<Book> getLoanedBooks() {
        return loanBooks;
    }

    public void loanBook(Book book) {
        loanBooks.add(book);
    }

    public void returnBook(Book book) {
        loanBooks.remove(book);
    }
}
