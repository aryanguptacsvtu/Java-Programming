interface Bicycle {

    int a = 100;

    void applyBrake();

    void speedUp(int increment);

}

interface Motorcycle {
    void Engine();

    void blowHorn();

}

class AvonCycle implements Bicycle, Motorcycle {

    public void Fuel() {
        System.out.println("Fuel Tank is Empty...");
    }

    @Override
    public void applyBrake() {
        System.out.println("Applying Brakes...");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Increasing Speed by " + increment + "...");
    }

    @Override
    public void Engine() {
        System.out.println("Starting the Engine...");
    }

    @Override
    public void blowHorn() {
        System.out.println("Blowing the Horn...");
    }
}

public class Interface1 {
    public static void main(String[] args) {

        AvonCycle obj = new AvonCycle();

        obj.Engine();
        obj.speedUp(10);
        obj.blowHorn();
        obj.Fuel();
        obj.applyBrake();

        System.out.println("\nValue of a : " + obj.a);

        // obj.a = 45; [INVALID]
        // We cannot modify the properties in Interfaces as they are final.
    }
}
/*
 * "Interface":- Interfce is a group of realted methods and empty bodies.
 * We cannot extend multiple Abstract classes but we can implement multiple
 * Interfaces at a time.
 */