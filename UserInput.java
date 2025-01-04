import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("Taking Input from the user:");

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nEnter INTEGER Values:-");
            System.out.print("Enter the value of a: ");
            int a = sc.nextInt();

            System.out.print("Enter the value of b: ");
            int b = sc.nextInt();

            int sum1 = a + b;
            System.out.println("The sum of " + a + " and " + b + " is: " + sum1);

            // boolean b1 = sc.hasNextInt(); {To detect whether the number is integer or
            // not}
            // System.out.println(b1);

            System.out.println("\nEnter DECIMAL Values:-");
            System.out.print("Enter the value of x: ");
            float x = sc.nextFloat();

            System.out.print("Enter the value of y: ");
            float y = sc.nextFloat();

            float sum2 = x + y;
            System.out.println("The sum of " + x + " and " + y + " is: " + sum2);

            // Clear the buffer
            sc.nextLine(); // Consume the leftover newline character

            System.out.println("\nEnter any STRING:-");
            String str = sc.nextLine();
            // String str = sc.next(); {ONLY takes input till first whitespace}

            System.out.println("Your string is : " + str);
        }
    }
}
