import java.util.Scanner;

public class Conditionals4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your income(in lakhs):");
            float income = sc.nextFloat();

            float tax = 0f;

            if (income <= 2.5) {
                tax = tax + 0;
            } 
            else if (income > 2.5f && income <= 5f) {
                tax = tax + 0.05f * (income - 2.5f);
            }
             else if (income > 5f && income <= 10f) {
                tax = tax + 0.05f * (5f - 2.5f);
                tax = tax + 0.2f * (income - 5f);
            }
             else if (income > 10f) {
                tax = tax + 0.05f * (5f - 2.5f);
                tax = tax + 0.2f * (10f - 5f);
                tax = tax + 0.3f * (income - 10f);
            }
            System.out.println("The total tax to be paid is : "+tax);
        }
    }
}
