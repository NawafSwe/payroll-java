public class SalaryEmployee extends Employee {

    public SalaryEmployee(String name, Double paid) {
        super(name, paid);
    }

    // customizing behaviors of salaryEmployee
    @Override
    public void setPaid(double paid) {

    }

    @Override
    public double getPaid() {
        return 0;
    }

}
