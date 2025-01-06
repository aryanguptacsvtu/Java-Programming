import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age;
            System.out.print("Enter your age : ");
            age = sc.nextInt();

            switch (age) {
                case 18:
                    System.out.println("You are an adult!");
                    break;

                case 23:
                    System.out.println("You are going to get a job!");
                    break;

                case 60:
                    System.out.println("You are going to get retired!");
                    break;

                default:
                    System.out.println("Enjoy your life!!");
            }
        }
        // "Enhanced SWITCH" :-
        String var = "Aryan";

        switch (var) {
            case "Shubham" -> System.out.println("Hello Shubham!!");
            case "Aryan" -> System.out.println("Hello Aryan!!");
            default -> System.out.println("Thanks for using my JAVA code!");
        }
    }
}
