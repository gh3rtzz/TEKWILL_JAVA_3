package lecture_nr_20;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeCollections {

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10); //Thread safe

        List<String> nonSynchronizedList = Arrays.asList("asd", "asd"); //non thread safe
        Collection<String> synchronizedList = Collections.synchronizedCollection(nonSynchronizedList); //thread safe


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(); //Not thread safe

        for(int index = 0; index != 10; index++){

            arrayBlockingQueue.offer(index);
        }

        Runnable runnable = () -> {
            System.out.println(arrayBlockingQueue.poll());
        };
        ExecutorService printer = Executors.newFixedThreadPool(5);

        for(int index = 0; index != 10; index++){
            printer.execute(runnable);
        }

        printer.shutdown();
    }
}
