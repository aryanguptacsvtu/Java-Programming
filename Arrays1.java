public class Arrays1 {
    public static void main(String[] args) {

        /*
         * Declaration and Memory Allocation together:-
         * int [] marks = new int[5];
         * 
         * Declaration and then Memory Allocation:-
         * int [] marks;
         * marks = new int[5];
         */

        // Declaration, Memory Allocation & Initialisation together:-
        int[] marks = { 34, 65, 77, 90, 23 };

        System.out.println("Values in Array : ");
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);
    }
}
