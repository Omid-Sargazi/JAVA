package layeredarchitecture;

import java.util.List;

public class LibraryController {
    private LibraryService libraryService = new LibraryService();

    public void addBook(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        libraryService.addBook(book);
    }

    public List<Book> viewBooks() {
        return libraryService.getBooks();
    }

    public void borrowBook(String isbn, Member member) {
        for (Book book : libraryService.getBooks()) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
                libraryService.returnBook(book);
                return;
            }
        }

        throw new IllegalStateException("Book not found or not borrowed");
    }
}
