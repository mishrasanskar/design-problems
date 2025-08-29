package multithreading;

import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) {


        ExecutorService exec = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        };

        Future<Integer> future = exec.submit(callable);

        try {
            int ans = future.get();
            System.out.println("Result " + ans);

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        exec.shutdown();

    }

}
