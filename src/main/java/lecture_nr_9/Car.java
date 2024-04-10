package lecture_nr_9;

public class Car extends Vehicle implements Movable{

    private int horsePower;
    private boolean isAWD;

    public Car(String manufacturer, String model, Long VIN, int horsePower, boolean isAWD) {
        super(manufacturer, model, VIN);
        this.horsePower = horsePower;
        this.isAWD = isAWD;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isAWD() {
        return isAWD;
    }

    public void setAWD(boolean AWD) {
        isAWD = AWD;
    }

    @Override
    public void move() {

        System.out.println("The car is moving...");
    }

    @Override
    public void park() {

        System.out.println("The car is now parked!");
    }
}
