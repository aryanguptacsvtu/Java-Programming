class Base {

    Base() {
        System.out.println("I am a Base class Constructor.");
    }

    Base(int x) {
        System.out.println("I am a Base class Constructor with value of x as : " + x);
    }
}

class Derived extends Base {

    Derived() {
        System.out.println("I am a Derived class Constructor.");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am an overloaded Derived class Constructor with value of y as : " + y);
    }
}

class ChildOfDerived extends Derived {

    ChildOfDerived() {
        System.out.println("I am Child of Derived class Constructor.");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am Child of Derived class Constructor with value of z as : " + z);
    }

}

public class Inheritance2 {
    public static void main(String[] args) {

        // Base b1 = new Base();
        // Base b2 = new Base(10);

        // Derived d1 = new Derived();
        // Derived d2 = new Derived(22, 33);

        // ChildOfDerived cd1 = new ChildOfDerived();
        @SuppressWarnings("unused")
        ChildOfDerived cd2 = new ChildOfDerived(44, 55, 66);

    }
}
/*
 * When there are multiple constructors in the parent class, the constructor
 * without any parameters is called from the child class.
 * If we want to call the constructor with parameters from parent class , we can
 * use "super" keyword.
 */