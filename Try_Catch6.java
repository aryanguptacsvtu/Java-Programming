import java.util.Scanner;

public class Try_Catch6 {
    public static void main(String[] args) {

        int[] arr = { 12, 45, 56, 13, 54, 655, 90 };

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int index;
        int i = 0;

        while (i < 5) {
            try {
                System.out.print("\nEnter the index : ");
                index = sc.nextInt();
                System.out.format("The value of arr[%d] : %d ", index, arr[index]);
                break;
            } catch (java.lang.Exception e) {
                System.out.println("Invalid Index!!");
                i++;
            }
        }

        if (i >= 5) {
            System.out.println("Error occured!You reached max retries.");
        }
    }

}

/*
 * Write a program that allows you to keep accessing an array unti a valid index
 * is given.If max retries exceed 5, print Error.
 */