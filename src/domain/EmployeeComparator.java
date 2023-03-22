package domain;

import java.util.Comparator;

public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
    private String sortType;

    public EmployeeComparator() {
        this("name");
    }

    public EmployeeComparator(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
