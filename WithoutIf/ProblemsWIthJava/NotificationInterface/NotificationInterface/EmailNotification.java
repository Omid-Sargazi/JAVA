package WithoutIf.ProblemsWIthJava.NotificationInterface.NotificationInterface;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending email: " + message);
    }
}
