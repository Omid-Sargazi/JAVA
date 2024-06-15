package SOLID;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

// Violates SRP: Mixing book logic and persistence logic
class BookService {
    public void saveBook(Book book) {
        // Code to save the book
    }

    public void printBook(Book book) {
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
    }
}

// Complies with SRP: Separate classes for persistence and printing
class BookPersistence {
    public void saveBook(Book book) {
        // Code to save the book
    }
}

class BookPrinter {
    public void printBook(Book book) {
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
    }
}
