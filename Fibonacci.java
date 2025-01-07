import java.util.Scanner;

public class Fibonacci {

    static void Fib(int n, int n1, int n2) {
        
        if (n > 0) {
            int n3 = n1 + n2;

            System.out.print(" " + n3);

            Fib(n - 1, n2, n3);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the no. of terms you want: ");
            int x = sc.nextInt();

            System.out.println("\nFibonacci Sequence:");
            System.out.print("0 1");

            Fib(x - 2, 0, 1);
        }
    }
}
