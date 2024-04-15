package lecture_nr_10.lambdaExample1;

public class Employee {

    String name;
    String surname;

    boolean canConductInterview;
    boolean canConductTraining;

    public Employee(String name, String surname, boolean canConductInterview, boolean canConductTraining) {
        this.name = name;
        this.surname = surname;
        this.canConductInterview = canConductInterview;
        this.canConductTraining = canConductTraining;
    }
}
