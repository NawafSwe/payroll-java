public class ManagerEmployee extends SalaryEmployee {
    private double bonus;

    public ManagerEmployee(String name, double paid, double bonus) {
        super(name, paid);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void setPaid(double paid) {
        super.setPaid(paid);
    }

    @Override
    public double getPaid() {
        return super.getPaid();
    }
}

