public class Methods1 {
    static int logic(int x, int y) {
        int z;
        if (x < y) {
            z = x + y;
        } else {
            z = (x + y) * 10;
        }
        return z;
    }

    public static void main(String[] args) {

        int a1 = 5;
        int b1 = 8;
        int c = logic(a1, b1);

        /*
         * "Method invocation using Object creation":-
         * Methods1 obj = new Methods1();   [Used for non-static Method]
         * int c = obj.logic(a1, b1);
         */
        int a2 = 12;
        int b2 = 10;
        int d = logic(a2, b2);

        System.out.println("Value of c : " + c);
        System.out.println("Value of d : " + d);
    }
}
