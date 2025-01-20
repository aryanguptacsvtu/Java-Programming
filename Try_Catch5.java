public class Try_Catch5 {
    public static int greet() {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;

        } catch (java.lang.Exception e) {
            System.out.println("Exception occurd!!");
            System.out.println("Reason : " + e);
        } finally {
            System.out.println("This is the end of the function...");
        }
        return -1;
    }

    public static void main(String[] args) {

        int result = greet();
        System.out.println("Result : " + result);
        System.out.println();

        int x = 6;
        int y = 3;

        while (y >= 0) {
            try {
                System.out.println("\nDivisioin of x/y : " + x / y);
            } 
            catch (java.lang.Exception E) {
                System.out.println("\nSome error occured!");
                System.out.println("REASON : " + E);
            } 
            finally {
                System.out.println("I am finally for value of y :" + y);
            }
            y--;
        }

        System.out.println("\n");

        try {
            System.out.println(50 / 5);
        } finally {
            System.out.println("This is finally.It will always be executed.");
        }

    }

}
