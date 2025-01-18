class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("Hello " + this.getName());
            i++;
        }
    }
}

public class Thread4 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Harry1");
        MyThread t2 = new MyThread("Harry2");
        MyThread t3 = new MyThread("Harry3");
        MyThread t4 = new MyThread("Harry4");
        MyThread t5 = new MyThread("Harry5(most important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
