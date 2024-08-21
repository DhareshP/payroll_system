This project is focused on the OOPS concept of Java.

Employee Payroll System:
A Payroll system is a method for managing and processing employee salaries. Payroll systems help businesses save time and money by automating tasks by calculating
salaries and distributing payments.

structure of the main file i.e Main.java:

```mermaid

```mermaid
flowchart TD
    A[Employee (Abstract Class)] --> B[FullTimeEmployee]
    A[Employee (Abstract Class)] --> C[PartTimeEmployee]
    
    B[FullTimeEmployee] --> D[monthlySalary: double]
    C[PartTimeEmployee] --> E[hoursWorked: int]
    C[PartTimeEmployee] --> F[hourlyRate: double]
    
    A --> G[id: int]
    A --> H[name: String]
    A --> I[calculateSalary(): abstract double]
    
    B --> J[calculateSalary(): double]
    C --> K[calculateSalary(): double]

    L[PayrollSystem] --> M[employeeList: ArrayList<Employee>]
    L[PayrollSystem] --> N[addEmployee(Employee employee)]
    L[PayrollSystem] --> O[removeEmployee(int id)]
    L[PayrollSystem] --> P[displayEmployees()]

    P --> Q[Employee Details]

    subgraph "Main Class"
        R[PayrollSystem payrollSystem = new PayrollSystem()]
        R --> S[addEmployee(emp1)]
        R --> T[addEmployee(emp2)]
        R --> U[displayEmployees()]
        R --> V[removeEmployee(2)]
        R --> W[displayEmployees()]
    end

```

```


