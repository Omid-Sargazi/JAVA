package librarySystem;

public class Book {
    private String title;
    private Author author;// Aggregation
    private Publisher publisher;// Association
    private boolean isLoaned; // Indicates if the book is loaned out

    public Book(String title, Author author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isLoaned = false;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    @Override
    public String toString() {
        return "Book: " + this.title + "by " + this.author + "published by: " + this.publisher;
    }

}
