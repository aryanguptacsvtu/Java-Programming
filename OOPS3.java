class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

public class OOPS3 {
    public static void main(String[] args) {

        Square obj = new Square();

        obj.side = 3;

        System.out.println("Area of Square : " + obj.area());
        System.out.println("Perimeter of Square : " + obj.perimeter());
    }

}
