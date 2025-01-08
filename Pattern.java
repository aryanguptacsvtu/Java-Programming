import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the required no. of lines: ");
            int n = sc.nextInt();

            for (int i = n; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
