import java.util.*;

public class Collections2 {
    public static void main(String[] args) {

        LinkedList<Integer> LL1 = new LinkedList<>();
        LinkedList<Integer> LL2 = new LinkedList<>();

        LL1.add(30);
        LL1.add(40);
        LL1.add(60);
        LL1.add(10);
        LL1.add(80);
        LL1.add(60);
        LL1.add(0, 50);
        LL1.add(0, 20);

        LL2.add(100);
        LL2.add(670);
        LL2.add(370);
        LL2.add(900);

        LL1.addAll(LL2);
        LL1.addFirst(444); // Inserts the specified element at the beginning of this list.
        LL1.addLast(555); // Appends the specified element to the end of this list.
        // LL2.clear();

        System.out.println("Contains : " + LL1.contains(30));
        System.out.println("Is Empty : " + LL1.isEmpty());

        System.out.println("\nIndex of 80 : " + LL1.indexOf(80));
        System.out.println("Index of 60: " + LL1.indexOf(60));
        System.out.println("Last Index of 60: " + LL1.lastIndexOf(60));
        System.out.println("Index of 450: " + LL1.indexOf(450));

        System.out.println("\nElements in Linked List LL1 : ");

        for (int i = 0; i < LL1.size(); i++) {
            System.out.print(" " + LL1.get(i));
        }

        LL1.set(1, 100);
        LL1.remove(9);

        System.out.println("\n\nElements in Linked List LL1 : ");

        for (int i = 0; i < LL1.size(); i++) {
            System.out.print(" " + LL1.get(i));
        }
    }

}
