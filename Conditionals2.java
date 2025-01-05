public class Conditionals2 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("USING LOGICAL AND:-");
        if (a && b && c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println("\nUSING LOGICAL OR:-");
        if (a || b || c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println("\nUSING NOT:-");
        System.out.println("NOT(a) : " + (!a));
        System.out.println("NOT(b) : " + (!b));
    }
}
