package Multithreading;

class SharedResourceMain {
    int data;
    boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
    }
}

public class ThreadCommunication10 {
    public static void main(String[] args) {

        SharedResourceMain resource = new SharedResourceMain();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
