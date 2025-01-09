import java.util.Scanner;

public class Recursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } 
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the no. whose factrial you want : ");
            int num = sc.nextInt();

            System.out.println("The factorial of " + num + " is : " + factorial(num));
        }
    }
}
