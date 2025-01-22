import java.util.TimeZone;

public class Calendar1 {
    public static void main(String[] args) {

        java.util.Calendar c = java.util.Calendar.getInstance();
        java.util.Calendar d = java.util.Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println("Calendar Type : " + c.getCalendarType());
        System.out.println("Time : " + c.getTime());

        System.out.println("\nTime Zone of c : " + c.getTimeZone());
        System.out.println("Time Zone ID of c : " + c.getTimeZone().getID());

        System.out.println("\nTime Zone of d : " + d.getTimeZone());
        System.out.println("Time Zone ID of d : " + d.getTimeZone().getID());
    }
}