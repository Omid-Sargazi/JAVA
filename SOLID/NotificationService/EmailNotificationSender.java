package SOLID.NotificationService;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending email with message: " + message);

    }
}
