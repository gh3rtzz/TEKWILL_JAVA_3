package lecture_nr_9;

public class Main {

    public static void main(String[] args) {

        Car carObject = new Car("BMW", "M4", 11112222L, 450, false);
        Plane planeObject = new Plane("Boeing", "777", 123123123L, 300, 4000);
        Boat boatObject = new Boat("Britanic", "Titanic", 91898123L, 5, "Garmin");
        Helicopter helicopterObject = new Helicopter("Kamov", "ka-52", 53431L, 2, 4);

        Flyable[] flyables = new Flyable[] {
                planeObject, helicopterObject
        };

        Swimmable[] swimmables = new Swimmable[]{
                boatObject
        };

        Movable[] movables = new Movable[]{
                carObject
        };

        planeObject.something();

//        Plane boatObject1 = new Helicopter("asd", "asd", 123L, 123, 123); Won't compile!
        Flyable helicopterObject1 = new Helicopter("asd", "asd", 123L, 123, 123);
        Vehicle vehicleObject = new Helicopter("asd", "asd", 123L, 123, 123);

        // Printing out the constant in the Flyable interface

        System.out.println(Flyable.MAX_HEIGHT);

        for(int index = 0; index != flyables.length; index++){
            flyables[index].takeOff();
        }

        //Default method in Flyable

        helicopterObject.something(); //Will stop the application
        planeObject.something(); //Will print a string

        //Static method in Flyable

        Flyable.somethingStatic();


    }
}
