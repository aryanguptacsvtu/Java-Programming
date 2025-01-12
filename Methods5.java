import java.util.Scanner;

public class Methods5 {

    static int sumRec(int num) {

        if (num == 1) {
            return 1;
        } else {
            return num + sumRec(num - 1);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();

            int result = sumRec(n);
            System.out.println("The sum of first " + n + " natural numbers is : " + result);
        }
    }
}
