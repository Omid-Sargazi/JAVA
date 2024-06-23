package SOLID.NotificationSystem;

public class NotificationService {
    private EmailSender emailSender = new EmailSender();

    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}
