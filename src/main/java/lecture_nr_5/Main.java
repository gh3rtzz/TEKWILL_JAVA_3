package lecture_nr_5;

public class Main {

    public static void main(String[] args) {

        //Autoboxing

        int x = 3;
        Integer y;

        y = x;

        System.out.println("Y: " + y);

        //Unboxing
        int z;
        Integer q = 3;

        z = q; //Unboxing

        System.out.println("Z: " + z);

        //Helper methods

        String s = "-123";

        Integer parsedInt = Integer.parseInt(s);

        parsedInt++;

        System.out.println(parsedInt);

        Float f1 = 3.01f;
        Integer i1 = 3;

//        f1 = i1; //Won't compile!

        float f2;
        int i2 = 3;

        f2 = i2; //Will compile!

        //Static context

        Car car1 = new Car("M4");
        Car car2 = new Car("BRZ");

        System.out.println(car1.model);
        System.out.println(car2.model);

        System.out.println(Car.model);

        Car.model = "E63";
        System.out.println(car1.model);
        System.out.println(car2.model);

        System.out.println("Nr of employees: " + Employee.nrOfEmployees);
        Employee employee1 = new Employee("Alexandr", "Ciobanu", 26);
        System.out.println("Nr of employees: " + Employee.nrOfEmployees);
        Employee employee2 = new Employee("Alexey", "Rusu", 30);

        System.out.println(employee1.name);
        System.out.println(employee2.name);

        System.out.println("Nr of employees: " + Employee.nrOfEmployees);

        Employee.decrementNrOfEmployees();

        Employee e1 = null;

//        System.out.println(e1.age); throws NullPointerException

        int[] array = new int[6];

        array[0] = 5;
        array[1] = 7;
        array[2] = 2;
        array[3] = 9;
        array[4] = 3;

//        System.out.println(array[6]); throws exception

        //Need to print all elements of array

        System.out.println("Printing all array elements");

        for(int index = 0; index != array.length; index++){
            System.out.println(array[index]);
        }

        //Need to print the sum of all elements

        int sum = 0;

        for(int index = 0; index != array.length; index++){
            sum += array[index];
        }

        System.out.println("Sum of all elements: " + sum);

        //Need to print out all even numbers

        System.out.println("Printing out all even numbers:");
        for(int index = 0; index != array.length; index++){
            if(array[index] % 2 != 0){
                System.out.println(array[index]);
            }
        }

        //Bidimenstional array

        int[][] biArray = new int[2][2];

        biArray[0][0] = 1;
        biArray[0][1] = 3;
        biArray[1][0] = 2;
        biArray[1][1] = 7;

        System.out.println("Printing bi array:");
        System.out.println(biArray[1][0]);
        System.out.println(biArray[0][1]);

        for(int row = 0; row != biArray.length; row++){
            for(int column = 0; column != biArray[row].length; column++){
                System.out.println(biArray[row][column]);
            }
        }

        //Sum of all elements in biArray

        int sum1 = 0;

        for (int row = 0; row != biArray.length; row++){
            for(int column = 0; column != biArray[row].length; column++){
                sum1 += biArray[row][column];
            }
        }

        System.out.println("Sum of all elements in biarray is: " + sum1);

        //print out all even numbers from biarray


        System.out.println("Printing out all even numbers from biarray");
        for (int row = 0; row != biArray.length; row++){
            for(int column = 0; column != biArray[row].length; column++){
                if(biArray[row][column] % 2 == 0){
                    System.out.println(biArray[row][column]);
                }
            }
        }

    }
}
