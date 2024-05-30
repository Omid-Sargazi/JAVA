package librarySystem;

public class Book {
    private String title;
    private Author author;// Aggregation
    private Publisher publisher;// Association

    public Book(String title, Author author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
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

    @Override
    public String toString() {
        return "Book: " + this.title + "by " + this.author + "published by: " + this.publisher;
    }

}
