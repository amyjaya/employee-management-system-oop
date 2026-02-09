// This class represents a single employee in the system
public class Employee {

    private String id;
    private String name;
    private String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods used when updating details
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Used when displaying employee information
    @Override
    public String toString() {
        return "Employee ID: " + id +
               ", Name: " + name +
               ", Department: " + department +
               ", Salary: " + salary;
    }
}
