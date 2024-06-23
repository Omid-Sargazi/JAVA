package SOLID.NotificationSystem;

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new EmailSenderDIP();
        NotificationServiceDIP notification = new NotificationServiceDIP(sender);
        notification.sendNotification("Hello i'm omid.");
    }
}
