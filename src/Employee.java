public abstract class Employee implements Payable {
    private String employeeId;
    private String name;
    private double averageMonthlySalary;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    protected void setAverageMonthlySalary(double salary) {
        this.averageMonthlySalary = salary;
    }

    @Override
    public String toString() {
        return "employee_ID: " + employeeId + ", Name: " + name + ", average_monthly_salary: " + String.format("%.2f", averageMonthlySalary);
    }
}

