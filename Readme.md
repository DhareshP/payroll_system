Employee Payroll System

This is a simple Java-based Payroll System that manages both full-time and part-time employees. The system allows adding, removing, and displaying employee details, including their salaries, using object-oriented principles. It is built using core Java concepts such as inheritance, abstraction, and polymorphism.

Features
Abstract Employee Class: Defines the common properties and methods for all types of employees.
Full-Time Employee: Implements a salary calculation based on a fixed monthly salary.
Part-Time Employee: Implements a salary calculation based on hours worked and hourly rate.
Payroll System: Manages the list of employees, including adding, removing, and displaying employee details.
Classes and Structure
1. Employee Class (Abstract)
This is an abstract base class that holds common attributes and methods for all employees.

Attributes:
id: Unique identifier for the employee.
name: Name of the employee.
Methods:
getName(): Returns the employee’s name.
getId(): Returns the employee’s ID.
calculateSalary(): Abstract method that calculates the salary for the employee.
toString(): Overridden method to display employee details including salary.
2. FullTimeEmployee Class (Concrete)
This class extends the Employee class and implements the salary calculation based on a fixed monthly salary.

Attributes:

monthlySalary: Salary for a full-time employee.
Methods:

calculateSalary(): Returns the fixed monthly salary for the employee.
3. PartTimeEmployee Class (Concrete)
This class also extends the Employee class and calculates the salary based on the hours worked and the hourly rate.

Attributes:

hoursWorked: Number of hours worked by the part-time employee.
hourlyRate: Rate per hour for the part-time employee.
Methods:

calculateSalary(): Returns the salary based on the hours worked and hourly rate.
4. PayrollSystem Class
This class manages the employee list, providing functionality to add, remove, and display employee details.

Attributes:

employeeList: An ArrayList that stores employees (both full-time and part-time).
Methods:

addEmployee(Employee employee): Adds an employee to the list.
removeEmployee(int id): Removes an employee by their ID.
displayEmployees(): Displays all the employees in the system, including their salary and details.
5. Main Class
The Main class is responsible for initializing the payroll system, adding employees, removing employees, and displaying employee details.

How the System Works
Adding Employees: Both full-time and part-time employees are added to the payroll system using the addEmployee() method. The system stores their details, including salary information.
Removing Employees: The removeEmployee() method allows removing an employee from the system using their unique ID.
Displaying Employees: The displayEmployees() method prints the employee's name, ID, and calculated salary using the overridden toString() method of the Employee class.

How to Run
Compile and run the Main class.
The system will:
Add two employees (full-time and part-time).
Display initial employee details.
Remove an employee.
Display the remaining employees.
