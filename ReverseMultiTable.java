// To print the Reverse Multiplication Table of a number:-
import java.util.Scanner;

public class ReverseMultiTable {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no. whose table you want : ");
            int n = sc.nextInt();

            System.out.printf("\n----Reverse Multiplication Table of %d----\n", n);

            for (int i = 10; i > 0; i--) {
                System.out.printf("\t%d X %d = %d\n", n, i, n * i);
            }
        }
    }
}
