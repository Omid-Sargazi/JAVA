package WithoutIf.ProblemsWIthJava.NotificationInterface.NotificationInterface;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emeilFactory = new EmailNotificationFactory();
        NotificationService emailService = new NotificationService(emeilFactory);
        emailService.sendNotification("Hello via Email!");
    }
}
