package lecture_nr_10.lambdaExample1;

public class TestCanConductTraining implements Testable{


    @Override
    public boolean test(Employee employee) {
        return employee.canConductTraining;
    }
}
