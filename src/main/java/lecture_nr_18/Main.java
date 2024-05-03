package lecture_nr_18;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnableObject = () -> {
            String color = Constants.ANSI_RED;
            printHelloWorldInLoop(color);
        };

        Runnable runnableObject1 = () -> {
            String color = Constants.ANSI_BLUE;
            printHelloWorldInLoop(color);
        };
        Thread t1 = new Thread(runnableObject1);
        Thread t2 = new Thread(runnableObject);

        t1.start();
        t2.start();

        System.out.println(Constants.ANSI_GREEN + "Printing from main thread: " + Thread.currentThread().getName());
    }

    public synchronized static void printHelloWorldInLoop(String color) {

        for (int index = 0; index != 10; index++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println(color + "I was interrupted! " + Thread.currentThread().getName());
            }
            System.out.println(color + "Hello World " + Thread.currentThread().getName());
        }
    }

    public synchronized static void printSomethingWithDelay(String color) {

        try {
            System.out.println(color + "Started sleeping! " + Thread.currentThread().getName());
            Thread.sleep(20);
            System.out.println(color + "I slept perfectly! " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(color + "I was interrupted! " + Thread.currentThread().getName());
        }
    }
}
