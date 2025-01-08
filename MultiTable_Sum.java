// To print the Sum of Multiplication Table of a number:-
import java.util.Scanner;

public class MultiTable_Sum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no. whose table you want : ");
            int n = sc.nextInt();
            int sum = 0;

            System.out.printf("\n----Multiplication Table of %d----\n", n);

            for (int i = 1; i <= 10; i++) {
                System.out.printf("\t%d X %d = %d\n", n, i, n * i);
                sum = sum + (n * i);
            }
            System.out.printf("\nThe Sum of numbers in Multiplication Table of %d is : %d", n, sum);
        }
    }
}
