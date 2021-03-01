public class ManagerEmployee extends SalaryEmployee {
    private double bonus;

    public ManagerEmployee(String name, double paid, double salary, double bonus) {
        super(name, paid, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getPaid() {
        return super.getSalary() * bonus + super.getSalary();
    }
}

