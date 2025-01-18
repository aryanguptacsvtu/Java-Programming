class MyNewThread1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("Hello World!");
            try {
                Thread.sleep(400);
            } // Causes the currently executing thread to sleep (temporarily cease execution)
              // for the specified number of milliseconds
            catch (InterruptedException ex) {
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("Thank you!");
            i++;
        }
    }
}

public class Thread5 {
    public static void main(String[] args) {

        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();

        t1.start();

        try {
            t1.join(); // It causes the t2 to wait untill t1 terminates.
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
