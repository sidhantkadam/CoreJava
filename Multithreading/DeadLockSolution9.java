package Multithreading;

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and try to access the pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finish using pen " + this);
    }
}

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and try to access paper");
        paper.finishWriting();
    }

    public void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finish using paper " + this);
    }
}

public class DeadLockSolution9 {
    public static void main(String[] args) {
        Paper paper = new Paper();
        Pen pen = new Pen();

        Thread task1 = new Thread(() -> {
            synchronized (pen) {                      // Solution for deadlock
                paper.writeWithPaperAndPen(pen);
            }
        });
        task1.start();

        Thread task2 = new Thread(() -> {
            pen.writeWithPenAndPaper(paper);
        });
        task2.start();
    }
}
