package lecture_nr_6.inheritance;

public class Developer extends Employee{

    public String programmingLanguage;

    public Developer(String name, String surname, int age, int yearsOfExperience, String programmingLanguage) {
        super(name, surname, age, yearsOfExperience);
        this.programmingLanguage = programmingLanguage;
    }
}
