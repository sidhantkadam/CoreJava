package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

class CounterPlus {
    public final ReentrantLock LOCK;

    public CounterPlus(){
        LOCK = new ReentrantLock();
    }

    public CounterPlus(boolean fair) {
        LOCK = new ReentrantLock(fair);
    }

    public void print() {
        LOCK.lock();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " acquired lock");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }
    }
}

public class FairVsUnfair9 {
    public static void main(String[] args) {
        CounterPlus plus = new CounterPlus(false);

        Runnable task = plus::print;
        for (int i = 1; i <= 10; i++) {
            new Thread(task, "Thread - " + i).start();
        }
    }
}
