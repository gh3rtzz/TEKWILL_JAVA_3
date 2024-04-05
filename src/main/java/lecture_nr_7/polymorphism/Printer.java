package lecture_nr_7.polymorphism;

public class Printer {

    public void print(int input){
        System.out.println("Printing parameter of type int: " + input);
    }

    public void print(char input){
        System.out.println("Printing parameter of type char: " + input);

    }

    public void print(String input){
        System.out.println("Printing parameter of type String: " + input);

    }

    public void print(boolean input){
        System.out.println("Printing parameter of type boolean: " + input);

    }
}
