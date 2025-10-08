package Multithreading;

class SharedResource {
    public synchronized static void printMessage(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedConcept4 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> SharedResource.printMessage("Thread 1"));
        Thread thread2 = new Thread(() -> SharedResource.printMessage("Thread 2"));
        Thread thread3 = new Thread(() -> SharedResource.printMessage("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}
