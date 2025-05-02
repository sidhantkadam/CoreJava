package Multithreading;

class SharedResource {
    synchronized static void printMessage(String message) {
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
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> SharedResource.printMessage("Thread 1"));
        Thread thread2 = new Thread(() -> SharedResource.printMessage("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
