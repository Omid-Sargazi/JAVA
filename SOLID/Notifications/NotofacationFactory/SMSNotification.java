package SOLID.Notifications.NotofacationFactory;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {

        System.out.println("Sending an SMS notification");
    }
}