package lecture_nr_9;

public class Plane extends Vehicle implements Flyable, Movable{

    private int nrOfPassengerPlaces;
    private int maxCargoSize;

    public Plane(String manufacturer, String model, Long VIN, int nrOfPassengerPlaces, int maxCargoSize) {
        super(manufacturer, model, VIN);
        this.nrOfPassengerPlaces = nrOfPassengerPlaces;
        this.maxCargoSize = maxCargoSize;
    }

    public int getNrOfPassengerPlaces() {
        return nrOfPassengerPlaces;
    }

    public void setNrOfPassengerPlaces(int nrOfPassengerPlaces) {
        this.nrOfPassengerPlaces = nrOfPassengerPlaces;
    }

    public int getMaxCargoSize() {
        return maxCargoSize;
    }

    public void setMaxCargoSize(int maxCargoSize) {
        this.maxCargoSize = maxCargoSize;
    }

    @Override
    public void takeOff() {

        System.out.println("The plane is gaining speed on the runway and taking off...");
    }

    @Override
    public void land() {

        System.out.println("The plane is approaching the runway and is landing...");
    }

    @Override
    public void move() {

        System.out.println("The plane is moving...");
    }

    @Override
    public void park() {

        System.out.println("The plane is now parked!");
    }

    @Override
    public void something() {

        System.out.println("Printing from default method in plane class");
    }
}
