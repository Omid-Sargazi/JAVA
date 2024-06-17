package SOLID;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
