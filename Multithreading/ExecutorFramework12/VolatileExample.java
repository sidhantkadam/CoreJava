package Multithreading.ExecutorFramework12;

class SharedObj {
    public volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer thread make flag as true !");
        flag = true;
    }

    public void getFlagIfTrue() {
        while (!flag) {
            //DO nothing
        }
        System.out.println("Flag is true..");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedObj obj = new SharedObj();

        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            obj.setFlagTrue();
        });

        Thread reader = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            obj.getFlagIfTrue();
        });

        reader.start();
        writer.start();
    }
}
