class MyNewThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World!");

    }
}

class MyNewThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("\nGood Morning!");
    }
}

public class Thread6 {
    public static void main(String[] args) {

        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();

        t1.setPriority(6);
        t2.setPriority(9);

        t1.start();
        System.out.println("\nPriority of t1 : " + t1.getPriority());
        System.out.println("Priority of t2 : " + t2.getPriority());
        
        System.out.println("State of t2 before start : " + t2.getState());

        t2.start();
        System.out.println("State of t2 after start : " + t2.getState());

        System.out.println("Reference of current thread : " + Thread.currentThread().getState());
    }
}
