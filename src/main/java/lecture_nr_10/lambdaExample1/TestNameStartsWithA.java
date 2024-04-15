package lecture_nr_10.lambdaExample1;

public class TestNameStartsWithA implements Testable{


    @Override
    public boolean test(Employee employee) {
        return employee.name.startsWith("A");
    }
}
