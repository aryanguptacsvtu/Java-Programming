public class Methods2 {
    static void greet() {
        System.out.println("Welcome to the JAVA program...");
    }

    static void change(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {

        greet();

        int[] array = { 12, 34, 56, 76, 89 };

        System.out.println("\nThe value of array[0] before calling function : " + array[0]);
       
        change(array); // In case of Array , the reference is passed.

        System.out.println("The value of array[0] after calling function : " + array[0]);
    }
}
