class InvalidInputException extends java.lang.Exception {

    @Override
    public String getMessage() {
        return "Cannot handle invalid input.";
    }

}

class DivideByZeroException extends java.lang.Exception {

    @Override
    public String getMessage() {
        return "Cannot divide by zero.";
    }

}

class MaxInputException extends java.lang.Exception {

    @Override
    public String getMessage() {
        return "Input cannot be greater than 100000.";
    }

}

class MaxMultiplyInputException extends java.lang.Exception {

    @Override
    public String getMessage() {
        return "Input cannot be greater than 7000 while multiplying.";
    }

}

class CustomCalculator {

    double add(int a, int b) throws InvalidInputException, MaxInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if ((a == 8 && b == 9) || (a == 9 && b == 8)) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    double subtract(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiply(int a, int b) throws MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } 
        else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(int a, int b) throws DivideByZeroException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }

}

public class Exercise5 {
    public static void main(String[] args) throws InvalidInputException, DivideByZeroException, MaxInputException, MaxMultiplyInputException {

        CustomCalculator obj = new CustomCalculator();

        System.out.println("Addition : " + obj.add(12, 23));
        System.out.println("Subtration : " + obj.subtract(100, 45));

        System.out.println("Multiplication : " + obj.multiply(10, 4));
        System.out.println("Division : " + obj.divide(30, 5));

        System.out.println("\nDemonstrating Exceptions :-");
        // System.out.println("Addition : " + obj.add(8, 9));
        // System.out.println("Subtration : " + obj.subtract(1000000, 45));
        // System.out.println("Multiplication : " + obj.multiply(10, 7100));
        // System.out.println("Division : " + obj.divide(40, 0));
    }
}

/*
 * Write a program to create a custom Calculator which performs following
 * operations:-
 * -> Addition
 * -> Subtraction
 * -> Multiplication
 * -> Division
 * 
 * It throws the following exceptions :-
 * 1. Invalid Input Exception in case of Addition for input values 8 & 9.
 * 2. Cannot Divide by 0 Exception.
 * 3. Max Input Exception if any of the input values exceed 100000.
 * 4. Max Multiply Input Exception if any of the input values exceed 7000.
 */