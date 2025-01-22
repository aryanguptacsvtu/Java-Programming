/**
 * This class is to demonstrate what JAVA Docs are and how to use them.
 * 
 * @author Aryan Gupta
 * @version 1.0
 * @since 2024
 * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/index.html"
 *      target="_blank">See Java Official Docs</a>
 */
public class JavaDocs1 {

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is : " + sum);
    }

    public static void main(String[] args) {

        add(12, 45);
    }

}
/*
 * NOTE :-
 * javadoc -d docs JavaDocs1.java [To generate Java Docs]
 * 
 * start docs/index.html [To open Java Docs in Browser]
 */