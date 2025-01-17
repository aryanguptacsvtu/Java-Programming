abstract class Pen {

    abstract public void write();

    abstract public void refill();
}

class FountainPen extends Pen {

    @Override
    public void write() {
        System.out.println("Writing...");
    }

    @Override
    public void refill() {
        System.out.println("Refilling...");
    }

    void changeNib() {
        System.out.println("Changing the Nib...");
    }
}

public class Interface5 {
    public static void main(String[] args) {

        FountainPen obj = new FountainPen();

        obj.refill();
        obj.write();
        obj.changeNib();
    }
}
