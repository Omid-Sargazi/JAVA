package SOLID.Notifications.NotofacationFactory;

public class PushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending a Push notification");
    }
}
