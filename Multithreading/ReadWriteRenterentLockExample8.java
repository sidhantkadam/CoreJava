package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Counter {
    public int count = 0;

    public ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public Lock readLock = lock.readLock();
    public Lock writeLock = lock.writeLock();

    public void incrementCount() {
        writeLock.lock();
        try {
            Thread.sleep(1000);
            count++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }
}

public class ReadWriteRenterentLockExample8 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.incrementCount();
                System.out.println(Thread.currentThread().getName() + " incremented");
            }
        });

        Thread reader1 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName() + " read : " + counter.getCount());
            }
        });

        Thread reader2 = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName() + " read : " + counter.getCount());
            }
        });

        writer.start();
        reader1.start();
        reader2.start();

        writer.join();
        reader1.join();
        reader2.join();
    }
}
