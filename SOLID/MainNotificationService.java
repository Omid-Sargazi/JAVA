package SOLID;

import java.util.HashMap;
import java.util.Map;

public class MainNotificationService {
    private final Map<String, NotificationSender> senders;

    public MainNotificationService() {
        senders = new HashMap<>();
        senders.put("email", new EmailNotificationSender());
        senders.put("sms", new SMSNotificationSender());
        senders.put("push", new PushNotificationSender());
    }

    public void sendNotification(String type, String message) {
        NotificationSender sender = senders.get(type);
        if (sender != null) {
            sender.send(message);
        } else {
            throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
