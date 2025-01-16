class Phone {

    public void camera() {
        System.out.println("Opening Camera...");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {

    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }

    public void music() {
        System.out.println("Playing music...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Phone obj = new Phone();
        SmartPhone obj2 = new SmartPhone();
        System.out.println("Using Base class :-");
        obj.on();
        obj.camera();
        
        System.out.println();
        System.out.println("Using Derived class :-");
        obj2.on();
        obj2.camera();
        obj2.music();

        System.out.println();
        Phone p = new SmartPhone();

        p.on();
        p.camera();
        // p.music(); {Not Allowed}
    }
}
