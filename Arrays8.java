//To find the MAX and MIN elemnt of an Array:-
import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int[] arr = new int[5];

            System.out.print("Enter the elements of Array : ");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            int max = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 5; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            for (int i = 0; i < 5; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("The max. element is : " + max);
            System.out.println("The min. element is : " + min);

        }

    }
}
