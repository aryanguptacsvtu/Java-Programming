interface Camera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning!!");
    }

    default void record4KVideo() { // DEFAULT METHOD
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String networks);
}

class MyCellPhone {

    void callNumber() {
        System.out.println("Calling...");
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi, Camera {

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks...");
        String[] networkList = { "Harry", "Aryan", "Neha" };
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    // public void record4KVideo() {
    // System.out.println("Taking snap & Recording in 4K ...");
    // } [ Can be "Override" in the MySmartPhone class]
}

public class Interface2 {
    public static void main(String[] args) {

        MySmartPhone obj = new MySmartPhone();

        String[] arr = obj.getNetworks();
        for (String elem : arr) {
            System.out.println(elem);
        }

        System.out.println();
        obj.callNumber();
        obj.pickCall();

        System.out.println();
        obj.takeSnap();
        obj.recordVideo();

        System.out.println();
        obj.connectToNetwork("Airtel 5G...");
        
        System.out.println();
        obj.record4KVideo();

        // obj.greet(); [INVALID]
    }
}

/*
 * "NOTE":-
 * Default methods enable us to add new functionality to existing Interfaces.
 * Classes implementing the interface need not implement the Default methods.
 * Interfaces can have static, Default and Private methods.
 */
