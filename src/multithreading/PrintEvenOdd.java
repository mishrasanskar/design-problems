package multithreading;

class Printer{
    private int x;
    private final int MX;

    public Printer(int x,int MX){
        this.x = x;
        this.MX = MX;
    }


    public synchronized void printOdd(){

        while(x < MX){
            while (x%2==0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName() + " " + x);
            x+=1;
            notify();
        }


    }

    public synchronized void printEven(){


        while(x < MX){
            while (x%2==1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName() + " " + x);
            x+=1;
            notify();
        }


    }


}

public class PrintEvenOdd {

    public static void main(String[] args) {

        Printer printer = new Printer(1,10);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();

    }
}
