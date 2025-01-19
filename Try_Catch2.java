import java.util.Scanner;

public class Try_Catch2 {
    public static void main(String[] args) {

        int[] arr = { 20, 65, 87, 33, 96 };
        int index, num;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the array index :");
            index = sc.nextInt();

            System.out.print("Enter the number you want to divide with :");
            num = sc.nextInt();
        }

        // Using try-catch block:-
        try {
            System.out.println("\nThe value of array at index entered is : " + arr[index]);
            System.out.println("The result is : " + arr[index] / num);

        } catch (ArithmeticException e) {
            System.out.println("\nArithmetic Exception occured!");
            System.out.println("Reason : " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArray Index Out Of Bounds Exception occured!");
            System.out.println("Reason : " + e);
        }
        catch (java.lang.Exception e) {
            System.out.println("\nSome other exception occurred.");
            System.out.println("Reason : " + e);
        }

        System.out.println("\nEnd of the program...");
    }

}
