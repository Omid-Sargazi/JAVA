package SOLID.Notifications;

public class NotificationService {
    public void sendNotification(String notificationType) {
        if (notificationType.equals("email")) {
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.sendNotification();
        } else if (notificationType.equals("sms")) {
            SMSNotification smsNotification = new SMSNotification();
            smsNotification.sendNotification();
        } else if (notificationType.equals("push")) {
            PushNotification pushNotification = new PushNotification();
            pushNotification.sendNotification();
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
