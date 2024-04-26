package lecture_nr_16;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Alex", "Soloviov", 20);
        Employee e2 = new Employee("Serghei", "Ciobanu", 40);
        Employee e3 = new Employee("ZXS", "Ciobanu", 30);

        System.out.println(e3.equals(e2));

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e3, e1, e2));

        System.out.println("hello".compareTo("Hello World"));

        employeeList.forEach(e -> System.out.println(e));
        System.out.println("--------------");
        System.out.println("SORTING BY NAME");
        employeeList.stream()
                .sorted(EmployeeCompareAlgos.SORT_BY_NAME.getComparator())
                .forEach(e -> System.out.println(e));

        System.out.println("SORTING BY SURNAME");
        employeeList.stream()
                .sorted(EmployeeCompareAlgos.SORT_BY_SURNAME.getComparator())
                .forEach(e -> System.out.println(e));

        System.out.println("SORTING BY AGE");
        employeeList.stream()
                .sorted(EmployeeCompareAlgos.SORT_BY_AGE.getComparator())
                .forEach(e -> System.out.println(e));

        System.out.println("SORT BY NAME AND SURNAME IN REVERSE");
        employeeList.stream()
                .sorted((o1, o2) -> {
                    return Comparator.comparing((Employee e) -> e.name)
                            .thenComparing((Employee e) -> e.surname)
                            .reversed()
                            .compare(o1, o2);
                })
                .forEach(e -> System.out.println(e));
    }
}
