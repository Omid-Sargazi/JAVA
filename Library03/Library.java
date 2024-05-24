package Library03;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed from the library: " + book.getTitle());

    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added to the library: " + member.getName());
    }

    public void removeMember(Member member) {
        members.remove(member);
        System.out.println("Member removed from the library: " + member.getName());

    }

    public void loanBook(Member member, Book book) {
        if (book.getStatus() == BookStatus.AVAILABLE) {
            book.setStatus(BookStatus.ON_LOAN);
            Loan loan = new Loan(member, book);
            loans.add(loan);
            System.out.println("Book '" + book.getTitle() + "' loaned to " + member.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available for loan.");

        }
    }

    public void returnBook(Member member, Book book) {
        Loan loan = findLoan(member, book);

        if (loan != null) {
            loans.remove(loan);
            book.setStatus(BookStatus.AVAILABLE);
            System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());

        } else {
            System.out.println("Book '" + book.getTitle() + "' was not borrowed by " + member.getName());
        }
    }

    private Loan findLoan(Member member, Book book) {
        for (Loan loan : loans) {
            if (loan.getMember() == member && loan.getBook() == book) {
                return loan;
            }
        }
        return null;
    }

}
