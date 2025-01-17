// Polymorphism in Interfaces :-

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

}

public class Interface4 {
    public static void main(String[] args) {

        Camera c = new MySmartPhone(); // This can use only 'Camera' methods

        c.record4KVideo();
        c.takeSnap();
        c.recordVideo();

        /*
         * c.getNetworks(); [INVALID]
         * c.callNumber();
         */
        MySmartPhone obj = new MySmartPhone();

        System.out.println(); // These all are VALID
        obj.callNumber();
        obj.pickCall();

        System.out.println();
        obj.takeSnap();
        obj.recordVideo();

        System.out.println();
        obj.connectToNetwork("JIO 5G...");

        System.out.println();
        obj.record4KVideo();
    }
}
