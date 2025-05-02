package Multithreading;

class Thread0 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i >= 0; --i) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

public class CreateThreadMethods1 {
    public static void main(String[] args) {
        Thread0 thread0 = new Thread0();
        thread0.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }

        Thread thread = new Thread(() -> new Thread1().run());
        thread.start();
    }
}
