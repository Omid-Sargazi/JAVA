package librarySystem;

public class Loan {
    private Book book;
    private Person person;

    public Loan(Book book, Person person) {
        this.book = book;
        this.person = person;
    }

    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Loan: " + book.getTitle() + " to " + person.getName();
    }
}
