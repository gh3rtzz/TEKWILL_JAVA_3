package lecture_nr_7;

public abstract class Employee extends Human {

    protected int yearsOfExperience;

    public Employee(String name, String surname, int age, int yearsOfExperience) {
        super(name, surname, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void work();

    public void clockOut(){
        System.out.println("The employee has clocked out...");
    }
}
