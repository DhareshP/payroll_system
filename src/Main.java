import java.util.ArrayList;

abstract class Employee{
    private int id;
    private String name;

    public Employee(int id, String name){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee[name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(id, name);
        this.monthlySalary = monthlySalary;
    }
    @Override //as abstract method was throwing error
    public double calculateSalary(){
        return monthlySalary;
    }
}
class PartimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate; //1000*5
    }
}

class PayrollSystem{ //array list in data structure
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }


    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee : employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployees(){
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}



public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("vicky", 1, 70000.0);
        PartimeEmployee emp2 = new PartimeEmployee("Ricky", 2, 40, 100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();

        System.out.println("Removing Employees");
        payrollSystem.removeEmployee(2);

        System.out.println("Remoaining Employee details: ");
        payrollSystem.displayEmployees();
    }
}