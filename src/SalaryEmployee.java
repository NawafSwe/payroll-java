abstract public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee(String name, Double paid, double salary) {
        super(name, paid);
        this.salary = salary;
    }

    // customizing behaviors of salaryEmployee

    abstract public double getPaid();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
