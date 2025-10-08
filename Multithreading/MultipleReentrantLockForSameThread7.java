package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultipleReentrantLockForSameThread7 {
    public static Lock l = new ReentrantLock();

    public static void callLock() {
        l.lock();
        System.out.println("Method is called..");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        secondCallMethod();
        l.unlock();
    }

    public static void secondCallMethod() {
        l.lock();
        System.out.println("Second Method is called..");
        l.unlock();
    }

    public static void main(String[] args) {
        callLock();
    }
}
