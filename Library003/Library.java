package Library003;

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
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void lendBook(Book book, Member member) {
        if (!books.contains(book)) {
            throw new IllegalArgumentException("Book is not available in the library");
        }
        if (!members.contains(member)) {
            throw new IllegalArgumentException("Member is not registered with the library");
        }
        loans.add(new Loan(book, member));
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Loan> getLoans() {
        return loans;
    }

}
