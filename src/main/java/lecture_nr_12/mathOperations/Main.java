package lecture_nr_12.mathOperations;

public class Main {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        MathOperations[] mathOperations = MathOperations.values();
        for(int i = 0; i != mathOperations.length; i++){

            calculateAndPrint(x, y, mathOperations[i]);
        }


    }

    public static void calculateAndPrint(int x, int y, MathOperations operation){

        System.out.println("The result of: " + operation + " is: " + operation.algorithm.apply(x, y));
    }
}
