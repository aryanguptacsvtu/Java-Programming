public class Operators2 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Using INCREMENT/DECREMENT Operator:");
        System.out.println("a : " + a);
        System.out.println("a : " + (a++));
        System.out.println("a : " + a);
        System.out.println("a : " + (++a));
        System.out.println("a : " + a);
        System.out.println("a : " + (a--));
        System.out.println("a : " + (--a));

        int x = 7;
        System.out.println("\ny : " + (++x * 8));

        char ch = 'C';

        System.out.println("\nch : " + ch);
        System.out.println("ch : " + (ch++));
        System.out.println("ch : " + ch);
        System.out.println("ch : " + (++ch));

    }
}