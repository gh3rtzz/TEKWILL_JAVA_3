package lecture_nr_7;

public class Accountant extends Employee {

    public String specialization;

    public Accountant(String name, String surname, int age, int yearsOfExperience, String specialization) {
        super(name, surname, age, yearsOfExperience);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("The accountant is calculating the sales reports...");
    }
}
