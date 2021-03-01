import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HourlyEmployee eh1 = new HourlyEmployee("Nawaf", 3.2, 23, 10.0);
        SalaryEmployee es1 = new ManagerEmployee("Bader", 3000, 40);
        SalaryEmployee es2 = new ManagerEmployee("Lamees", 5000, 1.5);
        SalaryEmployee es4 = new ManagerEmployee("Hadi", 1500, 10.5);
        // init a list
        Employee[] list = new Employee[4];
        // appending all emps in list
        list[0] = eh1;
        list[1] = es1;
        list[2] = es2;
        list[3] = es4;
        // testing all list output
        for (Employee employee : list) {
            System.out.println(employee);
        }

    }
}
