import domain.Employee;
import domain.EmployeeComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(101,"Ralph",2015),
                new Employee(102,"Carole",2021),
                new Employee(103,"John",2013),
                new Employee(104,"Jim",2018) ));

//        var comparator =  new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
        for(Employee e : employees){
            System.out.println(e);
        }

    }
}