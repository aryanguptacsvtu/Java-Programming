public class Arrays2 {

    public static void main(String[] args) {

        int[] marks = { 23, 65, 87, 33, 97 };

        System.out.println("Length of Array : " + marks.length);

        System.out.println("\nTraversing the array using for loop :-");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\n\nTraversing the array in Reverse Order using for loop :-");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\n\nTraversing the array using for-each loop :-");
        for (int element : marks) {
            System.out.print(element+" ");
        }
    }
}
