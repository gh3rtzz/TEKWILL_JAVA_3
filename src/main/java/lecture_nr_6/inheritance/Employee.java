package lecture_nr_6.inheritance;

public class Employee extends Human{

    public int yearsOfExperience;

    public Employee(String name, String surname, int age, int yearsOfExperience) {
        super(name, surname, age);
        this.yearsOfExperience = yearsOfExperience;
    }
}
