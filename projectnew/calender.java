package projectnew;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calender {
    public static void main(String[] args) {
        System.out.println("Calender");
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("YERA: " + cal.get(Calendar.YEAR));
        System.out.println("MONTH: " + cal.get(Calendar.MONTH));
        System.out.println("DAY: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("DATE: " + cal.get(Calendar.DATE));
        System.out.println("MINUTE: " + cal.get(Calendar.MINUTE));
        System.out.println("HOUR: " + cal.get(Calendar.HOUR));
    }
}
