public class HourlyEmployee extends Employee {
    // express number of weeks
    private int weeks;
    // express hours per week
    private double hours;
    // express how many per hour
    private double rate;

    // initial constructor
    public HourlyEmployee(String name, double paid, double hours, int weeks, double rate) {
        super(name, paid);
        this.hours = hours;
        this.weeks = weeks;
        this.rate = rate;
    }
    public HourlyEmployee(String name, double hours, int weeks, double rate) {
        super(name);
        this.hours = hours;
        this.weeks = weeks;
        this.rate = rate;
    }
    public double getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    // customizing behavior to get the employee paid based on his hours
    @Override
    public double getPaid() {
        return (this.weeks > 40 ? this.rate * 2 : this.rate) * this.hours * this.weeks;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "weeks=" + weeks +
                "paid= " + this.getPaid() + "$" +
                ", hours= " + hours +
                ", rate= " + rate +
                '}';
    }
}
