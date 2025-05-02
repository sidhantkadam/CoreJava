package Multithreading;

class MyExtraThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class ThreadLifeCycle2 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MyExtraThread thread = new MyExtraThread();
        System.out.println(thread.getState());            // NEW
        thread.start();                                   // RUNNABLE
        System.out.println(thread.getState());            // RUNNING
        Thread.sleep(1000);
        System.out.println(thread.getState());            // TIMED WAITING
        thread.join();
        System.out.println(thread.getState());            // TERMINATED
    }
}
