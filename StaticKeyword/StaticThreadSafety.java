package StaticKeyword;

class Counter {
    static int count = 0;

    static void incrementCount() {
        count++;
    }
}

public class StaticThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++) {
                Counter.incrementCount();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
               Counter.incrementCount();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count : " + Counter.count);
    }
}
