public class Associativity {
    public static void main(String[] args) {

        int a = 6 * 5 - 34 / 2;  
        int b = 60 / 5 - 34 * 2;

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        /*The precedence of (* & /) is same. So, they are evaluated on the basis of left to right associativity. */
    }
}
