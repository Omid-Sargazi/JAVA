package SOLIDandWithoutSOLID;

import java.util.HashMap;
import java.util.Map;

public class NotificationServiceSOLID {
    private final Map<String, NotificationSender> senders;

    public NotificationServiceSOLID() {
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
