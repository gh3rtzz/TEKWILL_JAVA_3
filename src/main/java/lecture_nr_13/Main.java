package lecture_nr_13;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        int x = 3;
        int y = 0;

        calculateLBYL(x, y);
        calculateEAFP(x, y);

//        System.out.println(x / y);

        System.out.println("I got here!");

        try {
            checkedException();
        } catch (AccessDeniedException | NullPointerException e) {
            System.out.println("Access to file is denied!");
        }
        catch (IOException e){
            System.out.println("IOException caught. Possible reason, the file doesn't exist!");
        }

//        throw new ArithmeticException();
//        throw new IOException(); Should be handled

        Employee employee = new Employee("Alexey", "Soloviov");

        employee.addEmployeeToList(employee);
        try {
            employee.findEmployeeByName("Alexey");
        } catch (EmployeeNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void calculateLBYL(int x, int y){

        if(y == 0)
            System.out.println(0);
        else
            System.out.println(x / y);
    }

    public static void calculateEAFP(int x, int y){

        try{
            System.out.println(x / y);
        } catch (ArithmeticException e){
//            System.out.println("Divide by 0!");
            System.out.println(0);
            e.printStackTrace();
        } finally {
            System.out.println("The try-catch block has finished executing");
        }
    }

    public static void checkedException() throws IOException {

        Files.readString(Path.of("asd"));
    }
}
