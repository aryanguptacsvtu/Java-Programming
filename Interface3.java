// Inheritance in Interfaces:-

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MyClass implements childInterface {
    
    @Override
    public void meth1() {
        System.out.println("This is method 1.");
    }

    @Override
    public void meth2() {
        System.out.println("This is method 2.");
    }

    @Override
    public void meth3() {
        System.out.println("This is method 3.");
    }

    @Override
    public void meth4() {
        System.out.println("This is method 4.");
    }
}

public class Interface3 {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
