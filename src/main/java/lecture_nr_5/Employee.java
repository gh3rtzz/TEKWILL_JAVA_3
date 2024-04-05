package lecture_nr_5;

public class Employee {

    static int nrOfEmployees = 0;

    String name;
    String surname;
    int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        nrOfEmployees++;
    }

    public static void decrementNrOfEmployees(){
        nrOfEmployees--;

        System.out.println("The number of employees is now: " + nrOfEmployees);
    }
}
