// Creating a Thread by "Implementing Runnable Interface":-
class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        int i = 0;

        while (i < 5000) {
            System.out.println("I am Studying now.");
            System.out.println("I am sad!");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        int i = 0;

        while (i < 5000) {
            System.out.println("I am Playing now.");
            System.out.println("I am happy!");
            i++;
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }

}
