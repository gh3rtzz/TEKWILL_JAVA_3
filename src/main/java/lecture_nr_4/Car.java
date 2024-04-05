package lecture_nr_4;

public class Car {

    String manufacturer;
    String model;
    int nrOfDoors;
    int hp;
    boolean isAWD;

    public Car(String manufacturer, String model, int nrOfDoors, int hp) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfDoors = nrOfDoors;
        this.hp = hp;
        this.isAWD = false;

        System.out.println("An object was just created using this constructor!");
    }

    public Car(String manufacturer, String model, int nrOfDoors, int hp, boolean isAWD) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfDoors = nrOfDoors;
        this.hp = hp;
        this.isAWD = isAWD;

        System.out.println("An object was just created using this constructor!");
    }

    public void drive(){
        System.out.println("The car " + manufacturer + model + " is driving....");
    }

    public void drift(){
        System.out.println("Car " + manufacturer + model + " with horsepower: " + hp + " is drifting...");
    }
}
