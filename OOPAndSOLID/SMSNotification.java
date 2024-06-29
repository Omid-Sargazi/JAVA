package OOPAndSOLID;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        // TODO Auto-generated method stub
        System.out.println("SMS Notification: " + message);
    }
}
