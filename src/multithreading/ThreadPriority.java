package multithreading;

// Q: Create two threads with different priorities and observe scheduling.
class MyRunnable4 implements Runnable{
    @Override
    public void run() {
        System.out.println("running " + Thread.currentThread().getName());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable4());
        Thread t2 = new Thread(new MyRunnable4());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
