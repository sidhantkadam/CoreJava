package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Greeting {
    ReentrantLock lock = new ReentrantLock();

    public void display(String name) {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Greetings from " + " : " + name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();
    }
}

class MyThread extends Thread {
    Greeting greet;
    String name;

    public MyThread(Greeting greet, String name) {
        this.greet = greet;
        this.name = name;
    }

    @Override
    public void run() {
        greet.display(name);
    }
}

public class ReentrantLockClass5 {
    public static void main(String[] args) {

        Greeting greet = new Greeting();
        MyThread thread1 = new MyThread(greet, "Abhay");
        MyThread thread2 = new MyThread(greet, "Mayuri");
        thread1.start();
        thread2.start();
    }
}
