import java.util.*;

// This class handles all employee management operations
public class EmployeeManagementSystem {

    // Stores employee ID and Employee object
    private HashMap<String, Employee> employeeMap;

    // Stores department name and list of employee IDs
    private HashMap<String, List<String>> departmentMap;

    // Constructor initializes HashMaps
    public EmployeeManagementSystem() {
        employeeMap = new HashMap<>();
        departmentMap = new HashMap<>();
    }

    // (i) Add a new employee to the system
    public void addEmployee(String id, String name, String department, double salary) {
        Employee emp = new Employee(id, name, department, salary);
        employeeMap.put(id, emp);
        assignEmployeeToDepartment(id, department);
    }

    // (ii) Assign employee to a department
    public void assignEmployeeToDepartment(String id, String department) {
        // Create department list if it does not exist
        departmentMap.putIfAbsent(department, new ArrayList<>());
        departmentMap.get(department).add(id);
    }

    // (iii) Update employee salary
    public void updateSalary(String id, double newSalary) {
        if (employeeMap.containsKey(id)) {
            employeeMap.get(id).setSalary(newSalary);
        }
    }

    // (iv) Get employee information
    public void getEmployeeInfo(String id) {
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("Employee not found.");
        }
    }

    // (v) List all employees
    public void listAllEmployees() {
        for (Employee emp : employeeMap.values()) {
            System.out.println(emp);
        }
    }

    // (vi) List employees by department
    public void listEmployeesByDepartment(String department) {
        List<String> ids = departmentMap.get(department);
        if (ids != null) {
            for (String id : ids) {
                System.out.println(employeeMap.get(id));
            }
        } else {
            System.out.println("No employees found in this department.");
        }
    }

    // (vii) Calculate total salary by department
    public double calculateTotalSalaryByDepartment(String department) {
        double total = 0;
        List<String> ids = departmentMap.get(department);
        if (ids != null) {
            for (String id : ids) {
                total += employeeMap.get(id).getSalary();
            }
        }
        return total;
    }

    // (viii) Generate department summary
    public void generateDepartmentSummary(String department) {
        System.out.println("Department: " + department);
        listEmployeesByDepartment(department);
        System.out.println("Total Salary: " +
                calculateTotalSalaryByDepartment(department));
    }
}
