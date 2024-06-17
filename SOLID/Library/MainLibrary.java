package SOLID.Library;

public class MainLibrary {
    private BookManager bookManager;
    private NotificationService notificationService;

    public MainLibrary(BookManager bookManager, NotificationService notificationService) {
        this.bookManager = bookManager;
        this.notificationService = notificationService;
    }

    public void addBook(String book) {
        bookManager.addBook(book);
    }

    public void lendBook(String book, String user) {
        if (bookManager.isBookAvailable(book)) {
            bookManager.lendBook(book);
            System.out.println("Lending book: " + book + " to user: " + user);
            notificationService.notifyUser(user, book);
        } else {
            System.out.println("Book not available: " + book);
        }
    }

    public void returnBook(String book) {
        bookManager.returnBook(book);
    }
}
