public class Typecasting {
    public static void main(String[] args) {
        char grade = 'B';

        grade = (char) (grade + 8);
        System.out.println("Encrypted Grade : " + grade);

        grade = (char) (grade - 8);
        System.out.println("Original Grade : " + grade);

        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println("Value of a : " + a);

        int x = 7 * 49 / 7 + 35 / 7;
        System.out.println("Value of x : " + x);
    }
}
