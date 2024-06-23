package SOLID.NotificationSystem;

public class EmailSenderDIP implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
