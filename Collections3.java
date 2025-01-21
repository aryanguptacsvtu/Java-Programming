import java.util.*;

public class Collections3 {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad1.add(30);
        ad1.add(40);
        ad1.add(60);
        ad1.add(80);
        ad1.add(60);
        ad1.add(70);

        System.out.println("\nElements in Array Deque ad1 : ");
        System.out.println(ad1);

        System.out.println("Get First : " + ad1.getFirst());
        System.out.println("Get Last : " + ad1.getLast());

        System.out.println("Peek : " + ad1.peek()); // Retrieves,but does not remove,the head of dequeue.
        System.out.println("Pop : " + ad1.pop()); // Removes and returns the first element of deque.
        ad2.add(100);
        ad2.add(370);
        ad2.add(900);
        ad1.push(1000); // Inserts the element at the front of deque.

        ad1.addAll(ad2);
        ad1.addFirst(444);
        ad1.addLast(555);

        System.out.println("\nElements in Array Deque ad1 : ");
        System.out.println(ad1);
        // ad2.clear();

        System.out.println("\nContains : " + ad1.contains(30));
        System.out.println("Is Empty : " + ad1.isEmpty());

        System.out.println("Get First : " + ad1.getFirst());
        System.out.println("Get Last : " + ad1.getLast());

        ad1.remove(900);

        System.out.println("\nElements in Array Deque ad1 : ");
        System.out.println(ad1);
        System.out.println("\nSize of ad1 : " + ad1.size());
    }

}
