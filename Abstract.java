abstract class Parent {

    Parent() {
        System.out.println("I am a constructor of Parent Class.");
    }

    public void sayHello() {
        System.out.println("Hello , World!!");
    }

    abstract public void greet(); // Abstract Method
}

class Child1 extends Parent {

    @Override
    public void greet() {
        System.out.println("Good Morning!!");
    }
}

abstract class Child2 extends Parent {

    public void func() {
        System.out.println("I am a normal method.");
    }
}

public class Abstract {
    public static void main(String[] args) {

        // Parent obj = new Parent(); {INVALID}
        // Child2 c = new Child2(); {INVALID}

        Child1 x = new Child1();
        x.greet();
    }

}

/*
 * "Abstract Method" :- A method that is declared without an implementation.
 * 
 * "Abstract Class" :- A class which includes abstract methods.
 * It is not possible to create an object of an Abstract class.
 * It is possible to create reference of an Abstract class.
 * 
 */
