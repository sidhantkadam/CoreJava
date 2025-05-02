package Multithreading;

class MyThreadClass extends Thread {
    public MyThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Priority :" + Thread.currentThread().getPriority() + " Count: " + i);
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CheckThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is Running !");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadClassMethods3 {
    public static void main(String[] args) throws InterruptedException {
        //run(), start(), join(), getName(), getState(), setPriority(), Constructor for setting name, interrupt(), setDaemon()

        MyThreadClass High = new MyThreadClass("High");
        MyThreadClass Low = new MyThreadClass("Low");
        MyThreadClass Medium = new MyThreadClass("Medium");

        High.setPriority(1);
        High.start();
        System.out.println(High.getName());
        System.out.println(High.getPriority());

        Low.setPriority(10);
        Low.start();
        System.out.println(Low.getName());
        System.out.println(Low.getPriority());

        Medium.setPriority(5);
        Medium.start();
        System.out.println(Medium.getName());
        System.out.println(Medium.getPriority());


        System.out.println("State :" + High.getState());
        System.out.println("State :" + Medium.getState());
        System.out.println("State :" + Low.getState());

        CheckThread thread = new CheckThread();
        thread.start();
        thread.interrupt();
    }
}
