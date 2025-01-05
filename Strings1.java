import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {

        String name = "Harry";
        // String name = new String("Harry");

        System.out.println("Your name is: " + name);

        int a = 23;
        float b = 5.32316f;
        System.out.printf("\nValue of a is %d & Value of b is %f", a, b);
        System.out.format("\nValue of a is %d & Value of b is %.2f\n", a, b);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter any string: ");
            String str = sc.nextLine();
            System.out.println("Your string is: " + str);
        }

    }
}
