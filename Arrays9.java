import java.util.Scanner;

public class Arrays9 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int[] arr = new int[5];
            boolean isSorted = true;

            System.out.print("Enter the elements of Array : ");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                System.out.println("The array is Sorted.");
            } else {
                System.out.println("The array is not Sorted.");

            }
        }
    }
}
