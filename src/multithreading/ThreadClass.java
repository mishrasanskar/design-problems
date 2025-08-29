package multithreading;

//Q: Print numbers 1–5 using a thread created from Runnable.


class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from thread, which extends thread class");
    }
}

public class ThreadClass {


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
