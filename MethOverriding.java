class Base {
    public void meth() {
        System.out.println("I am a Method of Base class.");
    }
}

class Derived extends Base{

    @Override
    public void meth() {
        System.out.println("\nMethod Overriding...");
        System.out.println("I am a Method of Derived class.");
    }

    public void func() {
        System.out.println("I am another method of Derived class.");
    }
}

public class MethOverriding {
    public static void main(String[] args) {

        Base b = new Base();
        Derived d = new Derived();

        b.meth();

        d.func();
        d.meth();
    }
}
