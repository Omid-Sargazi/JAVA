package Inheritance;

import java.util.List;
import java.util.ArrayList;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println("Book: " + book.title + "by " + book.author);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("C++ ", "Miki Lee");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showBooks();

    }
}