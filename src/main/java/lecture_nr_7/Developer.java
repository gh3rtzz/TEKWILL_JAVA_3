package lecture_nr_7;

public class Developer extends Employee {

    public String programmingLanguage;

    public Developer(String name, String surname, int age, int yearsOfExperience, String programmingLanguage) {
        super(name, surname, age, yearsOfExperience);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("The developer is developing some pretty bad code");
    }
}
