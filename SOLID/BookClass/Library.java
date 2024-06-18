package SOLID.BookClass;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMember() {
        return members;
    }

    public void issueBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            System.out.println("Book " + book.getTitle() + " issued to " + memberId);
        } else {
            System.out.println("Book not found!");
        }
    }

    public void returnBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            System.out.println("Book " + book.getTitle() + " returned by " + memberId);
        } else {
            System.out.println("Book not found!");
        }

    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
