public class VarArgs {

    static int sum(int... arr) {

        int result = 0;

        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    static int sum2(int x, int... arr) {
        // This requires atleast one Argument
        int result = x;

        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Using Variable Arguments in JAVA : ");
        
        System.out.println("\nCalling \"sum\" without any args : " + sum());
        System.out.println("The Sum of 1 : " + sum(1));
        System.out.println("The Sum of 1,2 : " + sum(1, 2));
        System.out.println("The Sum of 1,2,3 : " + sum(1, 2, 3));
        System.out.println("The Sum of 1,2,3,4 : " + sum(1, 2, 3, 4));

        System.out.println("\nThe Sum of 10 : "+sum2(10));
        System.out.println("The Sum of 10,20 : "+sum2(10,20));
    }
}
