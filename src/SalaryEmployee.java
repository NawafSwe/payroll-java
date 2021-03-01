abstract public class SalaryEmployee extends Employee {
    private double salary;

    // initial constructor
    public SalaryEmployee(String name, Double paid, double salary) {
        super(name, paid);
        this.salary = salary;
    }

    // secondary constructor
    public SalaryEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    // customizing behaviors of salaryEmployee

    /**
     * getting how much certain employee gets
     *
     * @return paid based on employee type if manager or else
     */
    abstract public double getPaid();

    /**
     * setting employee salary
     *
     * @param salary of employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * getting salary of employee
     *
     * @return salary of employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @return object string literals
     */
    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "name= " + super.getName() +
                ", salary= " + salary +
                '}';
    }
}
