package Multithreading;

class SharedResource {
    synchronized void printMessage(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedConcept {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(() -> sharedResource.printMessage("Thread 1"));
        Thread thread2 = new Thread(() -> sharedResource.printMessage("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
