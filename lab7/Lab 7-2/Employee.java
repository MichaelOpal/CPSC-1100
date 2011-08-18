
/**
 * Creates a new Employee object with a name, salary, and methods to modify them.
 * 
 * @author Michael Opalinski
 * @version 10-12-2009
 * Section 002
 */
public class Employee
{
    // Creates instance variables for name and salary
    private String name;
    private double salary;
    
    // Constructor
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    
    // Methods to return the name, salary, and give a raise.
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void raiseSalary(double byPercent)
    {
        double newSalary = salary * ( 1 + (byPercent/100));
        salary = newSalary;
    }
}
