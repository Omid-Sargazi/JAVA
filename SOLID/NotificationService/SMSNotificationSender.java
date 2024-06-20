package SOLID.NotificationService;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending SMS with message: " + message);

    }
}
