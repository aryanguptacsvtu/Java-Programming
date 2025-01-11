// To print the Pattern using Method:-
import java.util.Scanner;

public class Methods3 {

    static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
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