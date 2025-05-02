package Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    int accountBalance = 100;

    private final Lock lock = new ReentrantLock();

    public void withDrawAmount(int amount) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (accountBalance >= amount) {
                    try {
                        System.out.println("Processing with withdrawal process...");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    accountBalance -= amount;
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + " " + "Completed with Withdraw Process, Available Balance : " + accountBalance);
                } else {
                    System.out.println("Insufficient Balance !");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " " + "Could not acquire the lock..Wait for some time");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class LockingExampleBankAccount6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> {
            account.withDrawAmount(40);
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            account.withDrawAmount(40);
        });
        t2.start();
    }
}
