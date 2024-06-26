package OOPLibrary;

import java.util.List;
import java.util.ArrayList;

public class Member extends User {
    private List<Book> borrowedBooks;

    public Member(String username, String password) {
        super(username, password);
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(username + " borrowed " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(username + " returned " + book.getTitle());
    }

    public int getNumberOfBorrowedBooks() {
        return borrowedBooks.size();
    }

}
