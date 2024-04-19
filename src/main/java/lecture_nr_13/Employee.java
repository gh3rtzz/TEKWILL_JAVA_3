package lecture_nr_13;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String surname;
    private static List<Employee> employeeList;

    public Employee(String name, String surname) {
        employeeList = new ArrayList<>();
        this.name = name;
        this.surname = surname;
    }

    public void addEmployeeToList(Employee employee){

        this.employeeList.add(employee);
    }

    public Employee findEmployeeByName(String name) throws EmployeeNotFoundException {

        return employeeList.stream()
                .filter(e -> e.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found in the list!"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        Employee.employeeList = employeeList;
    }
}
