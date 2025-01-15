class Rectangle {
    int length;
    int breadth;

    // Getters and Setters :-
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume() {
        return length * breadth * height;
    }
}

public class Inheritance4 {
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();
        Cuboid obj2 = new Cuboid();

        obj1.setLength(15);
        obj1.setBreadth(10);

        System.out.println("Length of Rectangle : " + obj1.getLength());
        System.out.println("Breadth of Rectangle : " + obj1.getBreadth());
        System.out.println("Area of Rectangle : " + obj1.area());

        obj2.setLength(8);
        obj2.setBreadth(5);
        obj2.setHeight(4);

        System.out.println("\nLength of Cuboid : " + obj2.getLength());
        System.out.println("Breadth of Cuboid : " + obj2.getBreadth());
        System.out.println("Height of Cuboid : " + obj2.getHeight());
        System.out.println("Volume of Cuboid : " + obj2.volume());
    }

}
