package SOLID.BookClass;

import java.util.List;

public interface BookRepositorySOLID {
    void addBook(Book book);

    Book findBookByIsbn(String isbn);

    List<Book> getAllBooks();
}
