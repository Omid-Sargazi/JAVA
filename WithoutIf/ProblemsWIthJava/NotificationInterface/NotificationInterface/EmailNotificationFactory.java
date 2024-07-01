package WithoutIf.ProblemsWIthJava.NotificationInterface.NotificationInterface;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        // TODO Auto-generated method stub
        return new EmailNotification();
    }
}
