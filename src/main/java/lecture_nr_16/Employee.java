package lecture_nr_16;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    public String name;
    public String surname;
    public int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object inputObject){

        if(inputObject instanceof Employee tempEmployee){

            if(this.name.equals(tempEmployee.name)){
                if(this.surname.equals(tempEmployee.surname)){
                    return this.age == tempEmployee.age;
                }
            }
        }
        return false;
    }

    @Override
    public int compareTo(Employee o) {

        return Comparator.comparing((Employee e) -> e.name)
                .thenComparing((Employee e) -> e.surname)
                .thenComparingInt((Employee e) -> e.age)
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
