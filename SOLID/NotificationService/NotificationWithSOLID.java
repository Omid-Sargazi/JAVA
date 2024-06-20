package SOLID.NotificationService;

import java.util.HashMap;
import java.util.Map;

public class NotificationWithSOLID {
    private final Map<String, NotificationSender> senders;

    public NotificationWithSOLID() {
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
