package SOLID.Notifications;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("email");
        service.sendNotification("sms");
        service.sendNotification("push");
    }
}
