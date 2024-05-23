package MainLibrary;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void loanBook(Member member, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            loans.add(new Loan(member, book));
            System.out.println(member.getName() + " has borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Member member, Book book) {
        Loan loanToRemove = null;
        for (Loan loan : loans) {
            if (loan.getMember().equals(member) && loan.getBook().equals(book)) {
                loanToRemove = loan;
                break;
            }

        }

        if (loanToRemove != null) {
            loans.remove(loanToRemove);
            book.setAvailable(true);
            System.out.println(member.getName() + " has returned " + book.getTitle());
        } else {
            System.out.println(member.getName() + " does not have " + book.getTitle());
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - "
                    + (book.isAvailable() ? "Available" : "Not Available"));
        }
    }
}
