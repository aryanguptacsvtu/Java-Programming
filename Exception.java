import java.util.Scanner;

class MyException extends java.lang.Exception {

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }

    @Override
    public String toString() {
        return "I am toString()";
    }
}

public class Exception {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a : ");
            a = sc.nextInt();
        }

        if (a < 10) {
            try {
                throw new MyException();
                // throw new ArithmeticException("This is an arithmetic exception.");

            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println();

                e.printStackTrace();
                System.out.println("\nFinished...");
            }

        } else {
            System.out.println("All good...");
        }

        System.out.println("End of the program...");
    }
}
