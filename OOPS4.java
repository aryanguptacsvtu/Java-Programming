class Rectangle {

    public int area(int l, int b) {
        return l * b;
    }

    public int perimeter(int l, int b) {
        return 2 * (l + b);
    }
}

public class OOPS4 {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle();

        int a = obj.area(3, 5);
        int p = obj.perimeter(3, 5);

        System.out.println("Area of Rectangle : " + a);

        System.out.println("Perimeter of Rectangle : " + p);
    }

}
