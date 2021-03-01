public class ManagerEmployee extends SalaryEmployee {
    private double bonus;

    public ManagerEmployee(String name, double paid, double salary, double bonus) {
        super(name, paid, salary);
        this.bonus = bonus;
    }

    //secondary constructors
    public ManagerEmployee(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
        double computedPaid = this.getPaid();
        this.setPaid(computedPaid);
    }

    // if there is no bonus
    public ManagerEmployee(String name, double salary) {
        super(name, salary);
        this.bonus = 0.0;
        double computedPaid = this.getPaid();
        this.setPaid(computedPaid);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getPaid() {
        return (super.getSalary() * (this.getBonus() / 100)) + super.getSalary();
    }

    @Override
    public String toString() {
        return "ManagerEmployee{" +
                "name= " + super.getName() +
                " , paid= " + this.getPaid() +
                " , salary= " + this.getSalary() +
                " , bonus= " + bonus +
                '}';
    }
}

