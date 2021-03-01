
abstract public class Employee {
    private String name;
    private double paid;


    // constructor
    public Employee(String name, double paid) {
        this.name = name;
        this.paid = paid;

    }

    abstract public double getPaid();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

}
