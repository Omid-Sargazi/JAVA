package SOLID.Notifications.NotofacationFactory;

public class NotificationService {
    private NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification(String notificationType) {
        Notification notification = notificationFactory.createNotification(notificationType);
        if (notification != null) {
            notification.sendNotification();
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
