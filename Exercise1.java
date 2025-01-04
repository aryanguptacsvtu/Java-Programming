import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            float s1, s2, s3, s4, s5;

            System.out.print("Enter the Marks for Subject 1 : ");
            s1 = sc.nextFloat();

            System.out.print("Enter the Marks for Subject 2 : ");
            s2 = sc.nextFloat();

            System.out.print("Enter the Marks for Subject 3 : ");
            s3 = sc.nextFloat();

            System.out.print("Enter the Marks for Subject 4 : ");
            s4 = sc.nextFloat();

            System.out.print("Enter the Marks for Subject 5 : ");
            s5 = sc.nextFloat();

            float percentage = (s1 + s2 + s3 + s4 + s5) / 5;

            System.out.println("Percentage of Student : " + (percentage));
        }
    }
}

/*
 * Write a program to calculate percentage of a student by taking 5 subject
 * marks(out of 100) as user input.
 */