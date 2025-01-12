// To print the Pattern using Recursion:-
import java.util.Scanner;

public class Methods4 {

    static void pattern(int n) {

        if (n > 0) {
            pattern(n - 1);

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the required no. of lines: ");
            int rows = sc.nextInt();

            pattern(rows);
        }
    }
}