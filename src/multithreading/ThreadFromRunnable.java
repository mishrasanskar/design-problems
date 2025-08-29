package multithreading;

//Q: Write a program that prints "Hello from Thread!" using a custom thread by extending Thread.

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}

public class ThreadFromRunnable {

    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
