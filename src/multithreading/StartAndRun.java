package multithreading;


// Q: Demonstrate difference between start() and run().

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("running in " +  Thread.currentThread().getName());
    }
}

public class StartAndRun {

    public static void main(String[] args) {
        Thread t =  new Thread(new MyRunnable2());
        t.run();
        t.start();
    }
}
