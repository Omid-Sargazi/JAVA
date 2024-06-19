package SOLID.BookClass;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookRepository implements BookRepositorySOLID {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        // TODO Auto-generated method stub
        books.add(book);

    }

    @Override
    public Book findBookByIsbn(String isbn) {
        // TODO Auto-generated method stub
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        // TODO Auto-generated method stub
        return books;

    }
}
