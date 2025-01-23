
import java.lang.Exception;

/**
 * This class is to demonstrate method tags for generating JAVA documentation.
 * 
 * @param args These are the arguments supplied to the command line.
 * @author Aryan Gupta
 * @version 2.0
 * @since 2024
 * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/index.html"
 *      target="_blank">See Java Official Docs</a>
 */
public class JavaDocs2 {

    public static void main(String[] args) {

        try {
            int res = add(100, 33);
            System.out.println("The sum is : " + res);
        } 
        catch (Exception ex) {
            System.out.println("Exception occured!");
            System.out.println("Reason : " + ex);
        }
    }

    /**
     * This is a method description.You may consider this.
     * 
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception If "i" is 0
     * @deprecated This method is deprecated.Please use (+) operator
     */

    public static int add(int i, int j) throws Exception {

        if (i == 0) {
            throw new Exception();
        }
        int sum = i + j;
        return sum;
    }
}
