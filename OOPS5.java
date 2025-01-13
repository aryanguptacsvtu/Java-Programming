import java.util.Scanner;

class RockstarGames {

    public void setName(String n) {
        System.out.println("\nYour player name is : " + n);
    }

    public void fire() {
        System.out.println("Firing on the enemy...");
    }

    public void start() {
        System.out.println("\nStarting the game...");
    }
}

public class OOPS5 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            RockstarGames player = new RockstarGames();

            System.out.print("Enter your player name : ");
            String n = sc.nextLine();

            player.start();
            player.fire();
            player.setName(n);

        }

    }
}
