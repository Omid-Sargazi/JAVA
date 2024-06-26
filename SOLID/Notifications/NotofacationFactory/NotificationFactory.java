package SOLID.Notifications.NotofacationFactory;

public class NotificationFactory {
    public Notification createNotification(String notificationType) {
        if (notificationType == null || notificationType.isEmpty()) {
            return null;
        }
        if (notificationType.equals("email")) {
            return new EmailNotification();
        } else if (notificationType.equals("sms")) {
            return new SMSNotification();
        } else if (notificationType.equals("PUSH")) {
            return new PushNotification();
        }
        return null;
    }
}
