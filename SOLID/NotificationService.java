package SOLID;

public class NotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("email")) {
            sendEmail(message);
        } else if (type.equals("sms")) {
            sendSMS(message);
        } else if (type.equals("push")) {
            sendPushNotification(message);
        } else {
            try {
                throw IllegalArgumentException("Unknown notification type");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private Exception IllegalArgumentException(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'IllegalArgumentException'");
    }

    private void sendPushNotification(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending push notification with message: " + message);
    }

    private void sendSMS(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending SMS with message: " + message);
    }

    private void sendEmail(String message) {
        // TODO Auto-generated method stub
        System.out.println("Sending email with message: " + message);
    }
}
