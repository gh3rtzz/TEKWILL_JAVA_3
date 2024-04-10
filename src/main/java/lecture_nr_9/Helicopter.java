package lecture_nr_9;

import java.io.Serializable;

public class Helicopter extends Vehicle implements Flyable, Movable {

    private int nrOfPassengerPlaces;

    private int nrOfBlades;

    public Helicopter(String manufacturer, String model, Long VIN, int nrOfPassengerPlaces, int nrOfBlades) {
        super(manufacturer, model, VIN);
        this.nrOfPassengerPlaces = nrOfPassengerPlaces;
        this.nrOfBlades = nrOfBlades;
    }

    public int getNrOfPassengerPlaces() {
        return nrOfPassengerPlaces;
    }

    public void setNrOfPassengerPlaces(int nrOfPassengerPlaces) {
        this.nrOfPassengerPlaces = nrOfPassengerPlaces;
    }

    public int getNrOfBlades() {
        return nrOfBlades;
    }

    public void setNrOfBlades(int nrOfBlades) {
        this.nrOfBlades = nrOfBlades;
    }


    @Override
    public void takeOff() {

        System.out.println("Helicopter is spinning it's blades and is taking off...");
    }

    @Override
    public void land() {

        System.out.println("Helicopter is slowly descending to the ground...");
    }

    @Override
    public void move() {

        System.out.println("The helicopter is moving...");
    }

    @Override
    public void park() {

        System.out.println("The helicopter is now parked!");
    }
}
