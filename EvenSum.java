// Sum of first 'n' Even numbers :-
import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;

            System.out.print("Enter the value of n : ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                sum = sum + (2 * i);
            }
            System.out.println("The sum of first " + n + " even numbers is : " + sum);
        }
    }
}
