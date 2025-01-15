class Circle {
    int radius;

    Circle(int r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    int height;

    Cylinder(int r, int h) {
        super(r);
        height = h;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

public class Inheritance3 {
    public static void main(String[] args) {

        Circle obj1 = new Circle(10);
        System.out.format("Area of Circle :%.3f", obj1.area());

        Cylinder obj2 = new Cylinder(8, 5);
        System.out.format("\nVolume of Cylinder :%.3f", obj2.volume());

    }

}
