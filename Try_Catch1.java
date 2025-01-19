import java.util.Scanner;

public class Try_Catch1 {
    public static void main(String[] args) {

        int a, b;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a :");
            a = sc.nextInt();

            System.out.print("Enter the value of b :");
            b = sc.nextInt();
        }

        // Using try-catch block:-
        try {
            int c = a / b;
            System.out.println("The result is : " + c);

        } catch (ArithmeticException e) {
            System.out.println("We failed to divide.");
            System.out.println("Reason : " + e);
        }

        System.out.println("End of the program...");
    }

}
