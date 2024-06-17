package SOLID.Library;

public class SMSNotificationService implements NotificationService {
    @Override
    public void notifyUser(String user, String book) {
        System.out.println("SMS sent to user: " + user + " for book: " + book);
    }
}
