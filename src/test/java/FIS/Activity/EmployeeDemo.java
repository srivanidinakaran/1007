package FIS.Activity;

public class EmployeeDemo 
{
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee();
        employee.work();
        employee.setSalary(5000.0);
        System.out.println("Employee Salary: $" + employee.getSalary());

        // Create an HRManager object
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.setSalary(7000.0);
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        hrManager.addEmployee();
    }
}


