package SOLID.Library;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<String> books = new ArrayList<>();
    private List<String> lentBooks = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void lendBook(String book, String user) {
        if (books.contains(book)) {
            books.remove(book);
            lentBooks.add(book);
            System.out.println("Lending book: " + book + " to user: " + user);
            notifyUser(user, book);
        } else {
            System.out.println("Book not available: " + book);
        }
    }

    public void notifyUser(String user, String book) {
        System.out.println("Notification sent to user: " + user + " for book: " + book);
    }

    public void returnBook(String book) {
        if (lentBooks.contains(book)) {
            lentBooks.remove(book);
            books.add(book);
        } else {
            System.out.println("Book was not lent: " + book);
        }
    }
}
