package lecture_nr_7.polymorphism;

public class Calculation {

    public int returnSumOfTwoIntNumbers(int x, int y){
        return x + y;
    }

    public double returnSumOfTwoDoubleNumbers(double x, double y){
        return x + y;
    }

    //overloading

    public int returnSum(int x1, int y1){
        return x1 + y1;
    }

    public double returnSum(double x2, double y2){
        return x2 + y2;
    }

    public int returnSum(int x3){
        return x3 + x3;
    }

    public void returnSum(String input){
        System.out.println(input);
    }
}
