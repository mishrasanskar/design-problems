package multithreading;

//Q: Write a program where two threads increment a counter safely.

class Counter{
    private int count;

    Counter(int count){
        this.count = count;
    }

    public synchronized void increment(){
        count+=1;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationExample {

    public static void main(String[] args) {


        Counter counter = new Counter(0);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(counter.getCount());

    }
}
