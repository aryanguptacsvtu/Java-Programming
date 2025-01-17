// Creating a Thread by "Extending Thread Class":-
class MyThread1 extends Thread {

    @Override
    public void run() {
        int i = 0;

        while (i < 5000) {
            System.out.println("I am Cooking now.");
            System.out.println("I am sad!");
            i++;
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        int i = 0;

        while (i < 5000) {
            System.out.println("I am Chatting now.");
            System.out.println("I am happy!");
            i++;
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
