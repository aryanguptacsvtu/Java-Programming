
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar2 {
    public static void main(String[] args) {

        java.util.Calendar c = java.util.Calendar.getInstance();

        System.out.println("DATE : " + c.get(Calendar.DATE));

        System.out.println("TIME : " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        System.out.println("HOUR_OF_DAY : "+c.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Is Leap year : " + gc.isLeapYear(2025));

        System.out.println("\nTime Zones : ");
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        System.out.println("\nDefault Time Zone : "+TimeZone.getDefault());
    }

}
