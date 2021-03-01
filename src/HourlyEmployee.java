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

    // secondary constructor
    public HourlyEmployee(String name, double hours, int weeks, double rate) {
        super(name);
        this.hours = hours;
        this.weeks = weeks;
        this.rate = rate;
    }

    /**
     * getting number of hours
     *
     * @return number hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * getting rate per hour
     *
     * @return rate per hour
     */
    public double getRate() {
        return rate;
    }

    /**
     * getting number of weeks
     *
     * @return weeks
     */
    public int getWeeks() {
        return weeks;
    }

    /**
     * setting number of hours
     *
     * @param hours number of hours
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * set the rate per hour
     *
     * @param rate rate per hour
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * setting number of weeks
     *
     * @param weeks number of weeks
     */
    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    // customizing behavior to get the employee paid based on his hours

    /**
     * @return how many employee get paid
     */
    @Override
    public double getPaid() {
        return (this.weeks > 40 ? this.rate * 2 : this.rate) * this.hours * this.weeks;
    }

    /**
     * @return string to identify object
     */
    @Override
    public String toString() {
        return "HourlyEmployee{" +
                " weeks=" + weeks +
                ", paid= " + this.getPaid() + "$" +
                ", hours= " + hours +
                ", rate= " + rate +
                '}';
    }
}
