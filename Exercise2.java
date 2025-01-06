// ROCK - PAPER - SCISSORS GAME
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter 0 for Rock, 1 for Paper , 2 for Scissors : ");
            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("DRAW!!");
            } 
            else if ((userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0)
                    || (userInput == 2 && computerInput == 1)) {
                System.out.println("You WIN!!");
            } 
            else {
                System.out.println("Computer WIN!!");
            }

            switch (computerInput) {
                case 0 -> System.out.println("Computer choice : Rock");
                case 1 -> System.out.println("Computer choice : Paper");
                case 2 -> System.out.println("Computer choice : Scissors");
            }
        }
    }
}
