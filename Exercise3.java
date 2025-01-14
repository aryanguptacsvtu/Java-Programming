// Guess the number Game :-
import java.util.Random;
import java.util.Scanner;

class Game {
    int number;
    int inputNumber;
    int noOfGuesses = 0;

    Game() {

        Random rand = new Random();
        number = rand.nextInt(100);
    }

    public void takeUserInput(Scanner sc) {
        System.out.print("Guess the number : ");
        inputNumber = sc.nextInt();
    }

    public boolean isCorrectNumber() {

        noOfGuesses++;

        if (inputNumber == number) {
            System.out.format("You guessed it right , it was %d.", number);
            System.out.format("\nYou guessed it in %d attempts.", noOfGuesses);
            return true;
        } 
        else if (inputNumber < number) {
            System.out.println("Too low...");
        } 
        else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }

}

public class Exercise3 {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        Scanner sc = new Scanner(System.in);

        while (!b) {
            g.takeUserInput(sc);
            b = g.isCorrectNumber();

        }
    }

}
