package lecture_nr_11;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.addAll(Arrays.asList(
                new Employee("Alexey", "Soloviov", 20),
                new Employee("Alexey", "Soloviov", 20),
                new Employee("Dumitru", "Ciobanu", 30),
                new Employee("Ivan", "Artiomov", 40),
                new Employee("Alexandr", "Test", 50)
        ));

        //Need to get a list of all employee names

        //Traditional way
        List<String> employeeNamesList = new ArrayList<>();

        for (int index = 0; index != employeeList.size(); index++) {
            employeeNamesList.add(employeeList.get(index).getName());
        }

        System.out.println(employeeNamesList);

        //Streams way

        List<String> employeeNamesListStreams = employeeList.stream()
                .map(e -> e.getName())
                .toList();

        System.out.println(employeeNamesListStreams);

        //Filter elements | find employees older than 20
        System.out.println("------------------------ Older than 20");
        List<Employee> employeesOlderThan20 = employeeList.stream()
                .filter(e -> e.getAge() > 20)
                .toList();

        System.out.println(employeesOlderThan20);

        //Filter elements | find employees older than 20 and print out their surnames
        System.out.println("--------------------- Older than 20 surnames");
        List<String> employeesOlderThan20Surnames = employeeList.stream()
                .filter(e -> e.getAge() > 20)
                .map(e -> e.getSurname())
                .toList();

        System.out.println(employeesOlderThan20Surnames);

        //Count employees that have letter a in their name

        System.out.println("------------------- Count employees with names that contain letter A");
        long numberOfEmployeesWithLetterA = employeeList.stream()
                .map(e -> e.getName())
                .map(e -> e.toLowerCase(Locale.ROOT))
                .filter(e -> e.contains("a"))
                .count();

        long numberOfEmployeesWithLetterA1 = employeeList.stream()
                .map(e -> e.getName().toLowerCase(Locale.ROOT))
                .filter(e -> e.contains("a"))
                .count();

        System.out.println(numberOfEmployeesWithLetterA);
        System.out.println(numberOfEmployeesWithLetterA1);

        //Count employees that have letter a in their name | must be distinct names
        System.out.println("------------------------ count names with letter a distinct");
        long numberOfEmployeesWithLetterADistinct = employeeList.stream()
                .map(e -> e.getName().toLowerCase(Locale.ROOT))
                .filter(e -> e.contains("a"))
                .distinct()
                .count();

        System.out.println(numberOfEmployeesWithLetterADistinct);

        //Get all names of employees and print them in a distinct manner
        System.out.println("---------------------- distinct names");

        List<String> employeeNameDistinctList = employeeList.stream()
                .map(e -> e.getName())
                .distinct()
                .toList();

        System.out.println(employeeNameDistinctList);

        //Print out names that contain two letters A

        List<String> employeesWithNamesWithTwoALetters = employeeList.stream()
                .map(e -> e.getName().toLowerCase(Locale.ROOT))
                .filter(e -> e.indexOf('a') != e.lastIndexOf('a'))
                .toList();

        System.out.println(employeesWithNamesWithTwoALetters);

        System.out.println("------------------------- Printing all ages directly from stream");

        employeeList.stream()
                .map(e -> e.getAge())
                .forEach(e -> System.out.println(e));

        System.out.println("------------------------- Printing the list that will be empty after invalid filtration");

        List<Employee> employeeEmptyList = employeeList.stream()
                .filter(e -> e.getAge() > 80)
                .toList();

//        List<Employee> employeeEmptyList = null;

        System.out.println(employeeEmptyList);

        //Find first element in the employee list which name starts with A

        System.out.println("-----------Finding first element with name that starts with A");
        Optional<Employee> employeeOptional = employeeList.stream()
                .filter(e -> e.getName().startsWith("A"))
                .findFirst();

        System.out.println(employeeOptional.orElse(new Employee("Error!", "Error!", -1)));

        if(employeeOptional.isPresent()){
            System.out.println(employeeOptional.get());
        } else {
            System.out.println("Error! Employee optional is empty");
        }

        Optional<String> optionalString = Optional.ofNullable(null);


        //FlatMap

        List<List<Employee>> listOfEmployeeLists = new ArrayList<>();

        listOfEmployeeLists.addAll(Arrays.asList(employeeList, employeeList, employeeList));

        //Filter by age being more than 20

        System.out.println("--------------- Printing from flatmap");
        listOfEmployeeLists.stream()
                .flatMap(e -> e.stream())
                .filter(e -> e.getAge() > 20)
                .forEach(e -> System.out.println(e));

        //Need to find the number of employees in all the lists
        System.out.println("----------------- Printing number of elements in all lists");

        long numberOfEmployeesInAllLists = listOfEmployeeLists.stream()
                .flatMap(e -> e.stream())
                .count();

        System.out.println(numberOfEmployeesInAllLists);

        List<List<List<Employee>>> tripleList = new ArrayList<>();

        tripleList.stream()
                .flatMap(e -> e.stream())
                .flatMap(e -> e.stream())
                .filter(e -> e.getAge() > 20)
                .count();

        //String pools

        System.out.println("-------- STRING POOL");

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s3 == s4);

        System.out.println("------- HASH CODES: ---------");
        System.out.println("s1: " + System.identityHashCode(s1));
        System.out.println("s2: " + System.identityHashCode(s2));
        System.out.println("s3: " + System.identityHashCode(s3));
        System.out.println("s4: " + System.identityHashCode(s4));
    }
}
