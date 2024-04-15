package lecture_nr_10.lambdaExample1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employeeObject1 = new Employee("Alexey", "Soloviov", true, false);
        Employee employeeObject2 = new Employee("Dumitru", "Russu", true, true);
        Employee employeeObject3 = new Employee("Serghei", "Ciobanu", false, false);

        Testable canConductTrainingAlgorithm = new TestCanConductTraining();
        Testable canConductInterviewAlgorithm = new TestCanConductInterview();
        Testable nameStartsWithAAlgorithm = new TestNameStartsWithA();

        List<Employee> employeeList = List.of(employeeObject1, employeeObject2, employeeObject3);

        testEmployee(employeeList, canConductTrainingAlgorithm);
        testEmployee(employeeList, canConductInterviewAlgorithm);
        testEmployee(employeeList, nameStartsWithAAlgorithm);

        Testable test = (Employee e) -> {
            return e.canConductInterview;
        };

        testEmployee(employeeList, (Employee e) -> {
            return e.canConductTraining;
        });
    }

    public static void testEmployee(List<Employee> employeeList, Testable algorithm){

        for(int index = 0; index != employeeList.size(); index++){
            if(algorithm.test(employeeList.get(index))){
                System.out.println(employeeList.get(index));
            }
        }
    }
}
