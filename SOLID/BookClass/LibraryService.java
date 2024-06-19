package SOLID.BookClass;

public interface LibraryService {
    void issueBook(String isbn, String memberId);

    void returnBook(String isbn, String memberId);
}
