package multithreading;

// Q: Make a thread print numbers 1–3 with 1-second delay each.
class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SleepExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable3());
        t1.start();
    }
}
