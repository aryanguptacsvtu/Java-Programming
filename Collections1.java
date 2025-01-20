import java.util.*;

public class Collections1 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(10);

        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(1);
        l1.add(8);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 2);

        l2.add(10);
        l2.add(67);
        l2.add(37);
        l2.add(90);

        l1.addAll(l2); // Appends all of the elements in the specified collection.
        // l2.clear();

        System.out.println("Contains : " + l1.contains(3));
        System.out.println("Is Empty : " + l1.isEmpty());

        System.out.println("\nIndex of 8 : " + l1.indexOf(8));
        System.out.println("Index of 6: " + l1.indexOf(6));
        System.out.println("Last Index of 6: " + l1.lastIndexOf(6));
        System.out.println("Index of 450: " + l1.indexOf(450));

        System.out.println("\nElements in ArrayList l1 : ");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(" " + l1.get(i));
        }

        l1.set(1, 100);
        l1.remove(9);

        System.out.println("\n\nElements in ArrayList l1 : ");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(" " + l1.get(i));
        }
    }

}
