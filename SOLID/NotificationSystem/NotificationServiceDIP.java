package SOLID.NotificationSystem;

public class NotificationServiceDIP {
    private MessageSender messageSender;

    public NotificationServiceDIP(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}
