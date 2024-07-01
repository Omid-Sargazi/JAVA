package WithoutIf.ProblemsWIthJava.NotificationInterface;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending SMS: " + message);
    }
}
