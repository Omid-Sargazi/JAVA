package SOLID.NotificationService;

public class NotificationWithoutSOLID {
    public void sendNotification(String type, String message) {
        if (type.equals("email")) {
            sendEmail(message);
        } else if (type.equals("sms")) {
            sendSMS(message);
        } else if (type.equals("push")) {
            sendPushNotification(message);

        } else {
            throw new IllegalArgumentException("Unknown notification type");
        }
    }

    private void sendEmail(String message) {
        System.out.println("Sending email with message: " + message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }

    private void sendPushNotification(String message) {
        System.out.println("Sending push notification with message: " + message);
    }
}
