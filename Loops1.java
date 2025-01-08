public class Loops1 {

    public static void main(String[] args) {

        int i = 10;
        System.out.println("Using while loop :");

        while (i <= 17) {
            System.out.println("i : " + i);
            i++;
        }

        System.out.println("\nUsing do-while loop :");
        int j = 5;
        do {
            System.out.println("This will execute atleast once.");
            System.out.println("j : " + j);
            j++;
        } while (j < 4);
    }
}
