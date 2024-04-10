package lecture_nr_9;

public interface Flyable {

    void takeOff();
    void land();

    default void something() {

        return;
    }

    static void somethingStatic(){
        System.out.println("Im flying!!!");
    }

    static final Integer MAX_HEIGHT = 40000;
}
