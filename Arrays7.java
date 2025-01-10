//To reverse the elements of an Array:-
public class Arrays7 {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 31, 46, 50, 63 };

        System.out.print("ORIGINAL ARRAY : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        System.out.print("\nREVERSED ARRAY : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
