class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("I am a Thread.");
            i++;
        }
    }
}

public class Thread3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Harry");
        MyThread t2 = new MyThread("Amit");

        t1.start();
        t2.start();

        System.out.println("\nThe id of thread t1 is : " + t1.getId());
        System.out.println("The id of thread t2 is : " + t2.getId());

        System.out.println("The name of thread t1 is :" + t1.getName());
        System.out.println("The name of thread t2 is :" + t2.getName());
    }
}
