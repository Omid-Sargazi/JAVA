package SOLID.Library;

public class EmailNotificationService implements NotificationService {
    @Override
    public void notifyUser(String user, String book) {
        System.out.println("Email sent to user: " + user + " for book: " + book);
    }
}
