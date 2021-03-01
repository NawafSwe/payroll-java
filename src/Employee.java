
abstract public class Employee {
    // name of emp
    private String name;
    // paid of emp
    private double paid;


    // constructor
    public Employee(String name, double paid) {
        this.name = name;
        this.paid = paid;

    }

    // secondary constructor
    public Employee(String name) {
        this.name = name;
    }

    /**
     * getting how much employee get paid
     *
     * @return employee paid
     */
    abstract public double getPaid();

    /**
     * getting the name of employee
     *
     * @return name of employee
     */
    public String getName() {
        return this.name;
    }

    /**
     * getting name of employee
     *
     * @param name name of emp
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setting emp paid
     *
     * @param paid how much does emp get paid
     */
    public void setPaid(double paid) {
        this.paid = paid;
    }

    /**
     * @return object string
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name= " + name + '\'' +
                ", paid= " + paid +
                '}';
    }
}
