package OOPAndSOLID;

public class LibraryBookManager implements BookManager {
    @Override
    public void addBook(Book book) {
        // TODO Auto-generated method stub
        System.out.println("Book added: " + book.getTitle());
    }

    @Override
    public void removeBook(Book book) {
        // TODO Auto-generated method stub
        System.out.println("Book removed: " + book.getTitle());
    }
}
