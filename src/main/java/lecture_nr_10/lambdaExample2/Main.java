package lecture_nr_10.lambdaExample2;

public class Main {

    public static void main(String[] args) {

        int firstNumber = 3;
        int secondNumber = 5;

        Functionable addition = (int x, int y) -> {
            return x + y;
        };

        Functionable subtraction = (int x, int y) -> {
            int z = x + 3;
            return z - y;
        };



        printCalculationResults(firstNumber, secondNumber, addition);
        printCalculationResults(firstNumber, secondNumber, subtraction);

    }

    public static void printCalculationResults(int x, int y, Functionable algorithm){

        System.out.println("The result of the calculaton is: " + algorithm.apply(x, y));
    }

}
