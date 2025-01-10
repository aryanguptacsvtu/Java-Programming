// To find the sum of elements of an Array:-
public class Arrays4 {
    public static void main(String[] args) {

        float[] marks = { 23.45f, 67.87f, 28.9f, 19.44f, 89.6f };
        float sum = 0;

        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The Sum of elements of Array : " + sum);
    }
}
