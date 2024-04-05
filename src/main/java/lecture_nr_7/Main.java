package lecture_nr_7;

import lecture_nr_7.Employee;
import lecture_nr_7.Human;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("asd", "asd", 13);
        Developer employee = new Developer("asd", "asd", 20, 10, "C#");
        Accountant employee1 = new Accountant("asd", "asd" ,30, 5, "Sales");

        employee.work();
        employee1.work();

        Employee[] employeesArray = new Employee[]{
                employee, employee1
        };

        for(int index = 0; index != employeesArray.length; index++){
            employeesArray[index].work();
            employeesArray[index].clockOut();
        }




    }
}
