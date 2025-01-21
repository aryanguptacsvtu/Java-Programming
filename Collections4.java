import java.util.*;

public class Collections4 {
    public static void main(String[] args) {

        HashSet<Integer> hs1 = new HashSet<>(6, 0.5f);

        hs1.add(6);
        hs1.add(5);
        hs1.add(8);
        hs1.add(10);
        hs1.add(6); // It does not contain duplicate values.

        System.out.println("Elements in HashSet hs1 : ");
        System.out.println(hs1);

        System.out.println("\nContains : " + hs1.contains(6));
        System.out.println("Is Empty : " + hs1.isEmpty());
        System.out.println("Size of hs1 : " + hs1.size());

        hs1.remove(10);
    }

}
