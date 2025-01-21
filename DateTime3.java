import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime3 {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("\nDate and Time : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m:s");
        DateTimeFormatter df3 = DateTimeFormatter.ISO_DATE;

        String myDate = dt.format(df);
        String myDate2 = dt.format(df2);
        String myDate3 = dt.format(df3);

        System.out.println("\nMy Date : " + myDate);
        System.out.println("My Date2 : " + myDate2);
        System.out.println("My Date3 : " + myDate3);
    }

}
