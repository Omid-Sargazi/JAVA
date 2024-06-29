package layeredarchitecture;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void borrowBook(Book book, Member member) {
        if (book.isAvailable()) {
            Loan loan = new Loan(book, member);
            loans.add(loan);
            book.setAvailable(false);
        } else {
            throw new IllegalStateException("Book is not available");
        }
    }

    public void returnBook(Book book) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.getReturnDate() == null) {
                loan.setReturnDate(new Date());
                book.setAvailable(true);
                break;
            }
        }
    }
}
