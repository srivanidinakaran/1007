package FIS.Activity;


class Employee {
    private double salary;

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager is working.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding an employee.");
    }
}
