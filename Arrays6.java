// To find the sum of two (2x3) matrices:-
public class Arrays6 {
    public static void main(String[] args) {

        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 13, 5, 8 }, { 14, 15, 9 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Resultant Matrix after addition :-");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
