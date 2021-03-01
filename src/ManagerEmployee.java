public class ManagerEmployee extends SalaryEmployee {
    // bonus of employee
    private double bonus;

    // constructor
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

    /**
     * getting bonus of emp
     *
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * setting bonus of emp
     *
     * @param bonus of emp
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * getting emp paid
     *
     * @return how much emp get paid
     */
    @Override
    public double getPaid() {
        return (super.getSalary() * (this.getBonus() / 100)) + super.getSalary();
    }

    /**
     * @return object string
     */
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

