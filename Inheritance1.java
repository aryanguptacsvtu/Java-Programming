class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting X.");
        this.x = x;
    }

}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("\nI am in Derived and setting y.");
        this.y = y;
    }

}

public class Inheritance1 {
    public static void main(String[] args) {

        Base b = new Base();
        Derived d = new Derived();

        System.out.println("Using Base class Object :-");
        b.setX(10);
        System.out.println("Value of X :" + b.getX());

        System.out.println("\nUsing Derived class Object :-");
        d.setX(88);
        System.out.println("Value of X :" + d.getX());

        d.setY(55);
        System.out.println("Value of Y :" + d.getY());

        // b.setY(55); [ INVALID ]
        // System.out.println("Value of Y :" + b.getY());
    }
}
