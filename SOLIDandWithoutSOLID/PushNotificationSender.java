package SOLIDandWithoutSOLID;

public class PushNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending push notification with message: " + message);
    }
}
