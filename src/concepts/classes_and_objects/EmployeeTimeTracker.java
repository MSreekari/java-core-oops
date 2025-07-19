package concepts.classes_and_objects;

import java.util.ArrayList;
import java.util.List;

class Employee{
    String name;
    int empId;
    int hoursWorked;

    public Employee(String name, int empId, int hoursWorked){
        this.name = name;
        this.empId = empId;
        this.hoursWorked = hoursWorked;
    }

    public void logHours(int hours){
        this.hoursWorked += hours;
    }

    public void resetHoursWorked(){
        this.hoursWorked = 0;
    }

    @Override
    public String toString(){
        return "Employee Name: " + name + "\n" +
                "Employee Id: " + empId + "\n" +
                "Employee Hours Worked: " + hoursWorked;
    }
}

public class EmployeeTimeTracker {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Palak", 1, 3),
                new Employee("Karl", 2, 4),
                new Employee("Goyal", 3, 5)
        );
        Employee palak = employees.get(0);
        System.out.println(palak);
        System.out.println("----------------------------");
        palak.logHours(3);
        System.out.println(palak);
        System.out.println("----------End of the week----------");
        System.out.println("Resetting hours for the next week");
        for(Employee e: employees){
            e.resetHoursWorked();
        }
        System.out.println("-------------Start of the new week----------------");
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
