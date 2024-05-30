package librarySystem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private Library library;
    private List<Loan> loans;

    public Librarian(Library library) {
        this.library = library;
        this.loans = new ArrayList<>();
    }

    public void registerBook(Book book) {
        library.addBook(book);
        saveToFile("books.txt", "Registered book: " + book.toString());
    }

    public void loanBook(String title, Person person) {
        Book book = library.getBookByTitle(title);
        if (book != null && !book.isLoaned()) {
            book.setLoaned(true);
            person.loanBook(book);
            Loan loan = new Loan(book, person);
            loans.add(loan);
            saveToFile("loans.txt", "Loan: " + loan.toString());
        } else {
            System.out.println("Book is not available for loan.");
        }
    }

    public void returnBook(String title, Person person) {
        Book book = library.getBookByTitle(title);
        if (book != null && book.isLoaned()) {
            book.setLoaned(false);
            person.returnBook(book);
            loans.removeIf(loan -> loan.getBook().equals(book) && loan.getPerson().equals(person));
            saveToFile("loans.txt", "Return: " + person.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book is not currently loaned.");
        }

    }

    public List<Loan> getLoans() {
        return loans;
    }

    private void saveToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter("filesProject/" + filename, true)) {
            writer.write(content + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
