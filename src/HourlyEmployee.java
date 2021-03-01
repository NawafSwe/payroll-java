public class HourlyEmployee extends Employee {
    private int weeks;
    private double hours;

    public HourlyEmployee(String name, double paid, double hours, int weeks) {
        super(name, paid);
        this.hours = hours;
        this.weeks = weeks;
    }

    public double getHours() {
        return hours;
    }

    public int getWeeks() {
        return weeks;
    }

    // customizing behavior to get the employee paid based on his hours
    @Override
    public double getPaid() {
        return 0.0;
    }

    @Override
    public void setPaid(double paid) {
        // based on his hours 
    }
}
