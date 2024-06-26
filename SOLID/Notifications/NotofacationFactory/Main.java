package SOLID.Notifications.NotofacationFactory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = new NotificationService(factory);
        service.sendNotification("email");
        service.sendNotification("sms");
        service.sendNotification("push");
    }
}
