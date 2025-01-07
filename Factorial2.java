// To find the factorial of a number using 'while' loop:-
import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the no. whose factorial you want : ");
            int n = sc.nextInt();

            int fact = 1;
            int i = 1;

            if (n == 0) {
                System.out.println("The factorial of " + n + " is : 1");
            } 
            else {
                while (i <= n) {
                    fact = fact * i;
                    i++;
                }
                System.out.println("The factorial of " + n + " is : " + fact);
            }
        }
    }
}
