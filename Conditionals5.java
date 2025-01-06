import java.util.Scanner;

public class Conditionals5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter your website:");
            String website = sc.nextLine();

            if (website.endsWith(".com")) {
                System.out.println("This is a commercial website.");
            }
            else if (website.endsWith(".org")) {
                System.out.println("This is an organizational website.");
            }
            else if(website.endsWith(".in")) {
                System.out.println("This is an Indian website.");
            }
        }
    }
}
