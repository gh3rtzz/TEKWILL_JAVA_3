package lecture_nr_20;

import lecture_nr_19.Constants;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            Random random = new Random();
            System.out.println(Constants.ANSI_GREEN + "Runnable 1 " + Thread.currentThread().getName());
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnable2 = () -> {
            Random random = new Random();
            System.out.println(Constants.ANSI_RED + "Runnable 2 " + Thread.currentThread().getName());
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//
//        t1.start();
//        t2.start();

        ExecutorService threadPool1 = Executors.newFixedThreadPool(5);

        for(int index = 0; index != 50; index++){
            threadPool1.execute(runnable1);
        }

//        threadPool1.shutdown();

////        threadPool1.shutdown();
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
        for(int index = 0; index != 50; index++){
            threadPool1.execute(runnable2);
        }
        threadPool1.shutdown();
    }
}
