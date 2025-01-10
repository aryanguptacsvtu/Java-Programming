
// To search an element in the Array:-
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int[] marks = { 24, 67, 33, 80, 97, 100 };

            System.out.print("Enter element to seacrh : ");
            int num = sc.nextInt();

            boolean isInArray = false;
            int index = 0;
            
            for (int i = 0; i < marks.length; i++) {
                if (num == marks[i]) {
                    isInArray = true;
                    index = i;
                    break;
                }
            }

            if (isInArray) {
                System.out.println("The value is present in Array at index : " + index);
            } 
            else {
                System.out.println("The element is not present in Array.");
            }

        }
    }
}
