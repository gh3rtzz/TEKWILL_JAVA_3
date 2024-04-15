package lecture_nr_10.lambdaExample1;

public class TestCanConductInterview implements Testable{


    @Override
    public boolean test(Employee employee) {
        return employee.canConductInterview;
    }
}
