package SOLID;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
