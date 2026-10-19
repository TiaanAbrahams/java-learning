import Domain.Employee;
import Domain.EmployeeComparator;
import Domain.StoreEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001,"Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2015)
        ));
//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        employees.sort(new Employee.EmployeeComparator<>("YearStarted").reversed());

        for(var emp : employees){
            System.out.println(emp);
        }

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10151, "Joe", 2021,"Walmart"),
                new StoreEmployee(10152,"Tom",2018,"Macys"),
                new StoreEmployee(10322, "Bud", 2016, "Target")
        ));

        //How to access an instance nested class
        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for(StoreEmployee e : storeEmployees){
            System.out.println(e);
        }
    }
}