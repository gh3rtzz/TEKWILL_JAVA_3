package lecture_nr_16;

import java.util.Comparator;

public enum EmployeeCompareAlgos {

    SORT_BY_NAME((o1, o2) -> {return o1.name.compareTo(o2.name);}),
    SORT_BY_SURNAME((o1, o2) -> {return o1.surname.compareTo(o2.surname);}),
    SORT_BY_AGE((o1, o2) -> {return Integer.compare(o1.age, o2.age);});

    private Comparator<Employee> comparator;

    EmployeeCompareAlgos(Comparator<Employee> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Employee> getComparator() {
        return comparator;
    }
}
