class NegativeRadiusException extends java.lang.Exception {

    @Override
    public String getMessage() {
        return "You provided negative radius";
    }

    @Override
    public String toString() {
        return "You provided negative radius";
    }
}

public class Try_Catch4 {

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static double area(int r) throws NegativeRadiusException {

        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {

        try {
            int c = divide(100, 5);
            System.out.println("Value after division : " + c);

            double answer = area(-10);
            System.out.format("\nArea of circle : %.3f", answer);

        } catch (java.lang.Exception e) {
            System.out.println("Exception occured!");
            System.out.println("Reason : " + e);
        }
    }
}
/*
 * NOTE :-
 * "throw" is used to throw an exception explicitly by the programmer.
 * 
 * "throws" is used to declare an exception.It gives an information to
 * programmer that there might be an exception.
 */