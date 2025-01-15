class Base {
    int a;

    Base(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class Derived {

    Derived(int c) {
        super();
        System.out.println("I am a Constructor.");
    }

}

public class This_Super {
    public static void main(String[] args) {

        Base obj = new Base(10);
        System.out.println("Value of a : "+obj.getA());

        @SuppressWarnings("unused")
        Derived d = new Derived(55);
    }
}
/* "this" is a way for us to reference an object of the class which is being created/referenced.
 * 
 * "super" is used to refer immediate parent class object.It can be used to invoke parent class methods/Constructors.
 */