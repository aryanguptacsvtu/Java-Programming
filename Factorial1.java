// To find the factorial of a number using 'for' loop:-
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the no. whose factorial you want : ");
            int n = sc.nextInt();

            int fact = 1;

            if (n == 0) {
                System.out.println("The factorial of " + n + " is : 1");
            } 
            else {
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println("The factorial of " + n + " is : " + fact);
            }
        }
    }
}
