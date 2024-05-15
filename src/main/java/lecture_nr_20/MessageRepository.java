package lecture_nr_20;

import java.util.Objects;
import java.util.Random;

public class MessageRepository {

    private String message;
    private boolean hasMessage = false;

    public synchronized void write(String messageToWrite) {

        while(hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hasMessage = true;
        notifyAll();
        message = messageToWrite;
    }

    public synchronized String read() {

        while(!hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hasMessage = false;
        notifyAll();
        return message;
    }
}

class MessageReader implements Runnable {

    private MessageRepository messageRepository;
    private Random random = new Random();

    public MessageReader(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    public void run() {

        String readMessage = null;
        while (!Objects.equals(readMessage, "Finished!")) {
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            readMessage = messageRepository.read();
            System.out.println(readMessage);
        }
    }
}

class MessageWriter implements Runnable {

    private MessageRepository messageRepository;
    private Random random = new Random();

    private String[] messageArray = new String[]{
            "Hello!",
            "Hello motto",
            "Third message!",
            "4th message!",
            "Finished!"
    };

    public MessageWriter(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    public void run() {

        for (String element :
                messageArray) {
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            messageRepository.write(element);
        }
    }
}
