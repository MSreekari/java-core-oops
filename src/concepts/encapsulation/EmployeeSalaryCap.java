package concepts.encapsulation;

class Employee{
    private String name;
    private double salary;

    public void setSalary(double amount){
        if(amount <= 200000){
            this.salary = amount;
            System.out.println("Salary is: " + this.salary);
        }else{
            System.out.println("Salary is too big");
        }
    }

    public boolean isHighEarner(){
        return this.salary > 150000;
    }
}
public class EmployeeSalaryCap {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(10000);
        System.out.println("Salary greater than 1,50,000: " + emp.isHighEarner());
    }
}
