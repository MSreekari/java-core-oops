package concepts.inheritance;

class Employee{
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void calculateSalary(){
        System.out.println("Salary: " + this.baseSalary);
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary(){
        super.calculateSalary();
        System.out.println("Salary with bonus: " + (getBaseSalary()+this.bonus));
    }
}
class Intern extends Employee{

    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void calculateSalary(){
        System.out.println("Salary of Intern: " + getBaseSalary() * 0.8);
    }
}
public class EmployeeTypes {
    public static void main(String[] args) {
        Manager manager = new Manager("Param", 69458, 34);
        manager.calculateSalary();
        Intern intern = new Intern("Sundari", 46757);
        intern.calculateSalary();
    }
}
