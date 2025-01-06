import java.util.Scanner;

public class Conditionals3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int m1, m2, m3;

            System.out.print("Enter your Physics Marks:");
            m1 = sc.nextInt();

            System.out.print("Enter your Chemistry Marks:");
            m2 = sc.nextInt();

            System.out.print("Enter your Maths Marks:");
            m3 = sc.nextInt();

            float avg = (m1 + m2 + m3) / 3.0f;
            System.out.println("Your average is : " + avg);

            if (avg > 40 && m1 == 33 && m2 == 33 && m3 == 33) {
                System.out.println("You have been promoted!");

            } else {
                System.out.println("Sorry!You have not been promoted!");
            }
        }
    }
}
