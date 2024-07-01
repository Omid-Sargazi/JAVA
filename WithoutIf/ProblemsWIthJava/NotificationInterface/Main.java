package WithoutIf.ProblemsWIthJava.NotificationInterface;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        Notification emailNotification = service.createNotification("sms");
        emailNotification.send("I'm omid");
    }
}
