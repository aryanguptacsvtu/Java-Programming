public class Operators1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        System.out.println("USING ARITHMETIC OPERATORS:-");
        int a = 102;
        int b = 4;

        System.out.println("a + b :" + (a + b));
        System.out.println("a - b :" + (a - b));
        System.out.println("a * b :" + (a * b));
        System.out.println("a / b :" + (a / b));
        System.out.println("a % b :" + (a % b));

        System.out.println("\nUSING ASSIGNMENT OPERATORS:-");
        int y = 12;

        System.out.println("y += 3 :" + (y += 3));
        System.out.println("y -= 2 :" + (y -= 2));
        System.out.println("y *= 4 :" + (y *= 4));
        System.out.println("y /= 6 :" + (y /= 6));

        System.out.println("\nUSING COMPARISON OPERATORS:-");

        System.out.println("64>6 :" + (64 > 6));
        System.out.println("64<6 :" + (64 < 6));
        System.out.println("64==6 :" + (64 == 6));
        System.out.println("5>=5 :" + (5 >= 5));

        System.out.println("\nUSING LOGICAL OPERATORS:-");

        System.out.println("64>6 && 34<5 :" + (64 > 6 && 34 < 5));
        System.out.println("64>6 || 34<5 :" + (64 > 6 || 34 < 5));
        System.out.println("100 != 34 :" + (100 != 34));

        System.out.println("\nUSING BITWISE OPERATORS:-");

        System.out.println("2 & 3 :" + (2 & 3));
        System.out.println("2 | 3 :" + (2 | 3));
    }
}
