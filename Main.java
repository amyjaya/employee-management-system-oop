// Main class to demonstrate the Employee Management System
public class Main {

    public static void main(String[] args) {

        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // Adding at least five employees
        system.addEmployee("E001", "Amintha", "IT", 85000);
        system.addEmployee("E002", "Kasuni", "Finance", 78000);
        system.addEmployee("E003", "Nimal", "R&D", 92000);
        system.addEmployee("E004", "Saman", "IT", 80000);
        system.addEmployee("E005", "Tharushi", "Finance", 75000);

        // Updating employee salary
        system.updateSalary("E004", 83000);

        // Display information of a specific employee
        System.out.println("\nEmployee Information:");
        system.getEmployeeInfo("E003");

        // List all employees
        System.out.println("\nAll Employees:");
        system.listAllEmployees();

        // List employees by department
        System.out.println("\nIT Department Employees:");
        system.listEmployeesByDepartment("IT");

        // Calculate total salary by department
        System.out.println("\nTotal Salary (Finance): " +
                system.calculateTotalSalaryByDepartment("Finance"));

        // Generate department summary
        System.out.println("\nDepartment Summary (R&D):");
        system.generateDepartmentSummary("R&D");
    }
}
