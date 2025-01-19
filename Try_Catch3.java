import java.util.Scanner;

public class Try_Catch3 {
    public static void main(String[] args) {

        int[] arr = { 20, 65, 87, 33, 96 };
        int index, num;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the array index :");
            index = sc.nextInt();

            System.out.print("Enter the number you want to divide with :");
            num = sc.nextInt();
        }

        try {
            System.out.println("Using Nested try-catch : ");

            try {
                System.out.println("\nThe value of array at index entered is : " + arr[index]);
                System.out.println("The result is : " + arr[index] / num);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nException at Level 2");
                System.out.println("Array Index Out Of Bounds Exception occured!");
                System.out.println("Reason : " + e);
            }
        } 
        catch(Throwable e) {
            System.out.println("\nException at Level 1");
            System.out.println("Some other exception occured.");
            System.out.println("Reason : " + e);
        }

        System.out.println("\nEnd of the program...");
    }

}
