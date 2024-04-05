package lecture_nr_6.inheritance;

public class Accountant extends Employee{

    public String specialization;

    public Accountant(String name, String surname, int age, int yearsOfExperience, String specialization) {
        super(name, surname, age, yearsOfExperience);
        this.specialization = specialization;
    }
}
