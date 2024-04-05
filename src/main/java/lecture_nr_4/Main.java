package lecture_nr_4;

public class Main {

    public static void main(String[] args) {

//        test();
//
//        int result;
//        result = multiply(); //6 -> int
//
//        System.out.println(result);

        // shortcut
//        System.out.println(multiply(2, 3));

        multiply(3, 3);
        multiply(4, 5);
        multiply(2, 2);
        multiply(10, 15);

        divide(5, 0);
        divide(4, 2);

        Car car1 = new Car("BMW", "M4", 2, 450, false);
        Car car2 = new Car("Mercedes", "E63 AMG", 4, 590, true);
        Car car3 = new Car("Subaru", "BRZ", 2, 250, false);
        Car car4 = new Car("Subaru", "WRX", 4, 380);



        System.out.println("--------------");
        System.out.println("Car model: " + car2.isAWD);
        System.out.println("Car manufacturer " + car2.manufacturer);
        System.out.println("Car model: " + car4.isAWD);

        car2.drift();
        car3.drive();
        car4.drift();

        printCarInformation(car1);
        printCarInformation(car2);
        printCarInformation(car3);
        printCarInformation(car4);

        float maxFloat = Integer.MAX_VALUE;



    }

    static void printCarInformation(Car inputCar){

        System.out.println("Car manufacturer: " + inputCar.manufacturer
                + " Car model: " + inputCar.model
                + " Car nrOfDoors: " + inputCar.nrOfDoors
                + " Car hp: " + inputCar.hp
                + " Car isAWD?: " + inputCar.isAWD);
    }


    static void multiply(int x, int y){

        int result;

        result = x * y;
        System.out.println("The result of multiplication is: " + result);

        yell();

//        return result;
    }

    static void yell(){

        System.out.println("HEYYYY!!!");
    }

    static void divide(int x, int y){

        float result;

        if(y == 0) {
            return;
        }
        result = x / y;

        System.out.println("The result of division is: " + result);
    }

    static void test(){

        System.out.println("Hello World!");
    }

}
