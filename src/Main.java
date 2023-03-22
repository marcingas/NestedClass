import domain.Employee;
import domain.EmployeeComparator;
import domain.StoreEmployee;

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
        System.out.println("Store Members");
        List<StoreEmployee>storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015,"Meg",2014,"Target"),
                new StoreEmployee(10016,"Joe",2017,"Walmart"),
                new StoreEmployee(10017,"Tom",2019,"Macys"),
                new StoreEmployee(10018,"Joy",2013,"Target"),
                new StoreEmployee(10019,"Troy",2011,"Walmart")));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for(StoreEmployee e : storeEmployees){
            System.out.println(e);
        }
    }
}