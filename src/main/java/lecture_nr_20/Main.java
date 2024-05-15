package lecture_nr_20;

public class Main {

    public static void main(String[] args) {
        MessageRepository messageRepository = new MessageRepository();

        MessageWriter messageWriter = new MessageWriter(messageRepository);
        MessageReader messageReader = new MessageReader(messageRepository);

        Thread writerThread = new Thread(messageWriter);
        Thread readerThread = new Thread(messageReader);

        writerThread.start();
        readerThread.start();
    }
}
