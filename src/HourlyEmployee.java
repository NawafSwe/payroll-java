public class HourlyEmployee extends Employee {
    private int weeks;
    private double hours;
    private double rate;

    public HourlyEmployee(String name, double paid, double hours, int weeks, double rate) {
        super(name, paid);
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
        if (hours > 40) {
            this.setRate(this.rate * 2);
        }
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
        return this.rate * this.hours * this.weeks;
    }


}
