package OnlineVisit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(0, "omid01", "123", "o@o.com", 1, "omid", new Date(), "09128012945");
        p1.changePassword("123", "1234");
        System.out.println("Online visit" + p1);
    }
}
