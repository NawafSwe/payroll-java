import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HourlyEmployee eh1 = new HourlyEmployee("nawaf", 40.0, 41, 20.0);
        SalaryEmployee es1 = new ManagerEmployee("Nawaf", 2000, 2.5);
        SalaryEmployee es2 = new ManagerEmployee("Nawaf", 2000, 2.5);
        SalaryEmployee es3 = new ManagerEmployee("Nawaf", 2000, 2.5);
        SalaryEmployee es4 = new ManagerEmployee("Nawaf", 2000, 2.5);
        HourlyEmployee eh2 = new HourlyEmployee("nawaf", 40.0, 41, 20.0);
        HourlyEmployee eh3 = new HourlyEmployee("nawaf", 40.0, 41, 20.0);
        HourlyEmployee eh4 = new HourlyEmployee("nawaf", 40.0, 41, 20.0);
        HourlyEmployee eh5 = new HourlyEmployee("nawaf", 40.0, 41, 20.0);
        // init a list
        Employee[] list = new Employee[9];
        // appending all emps in list
        list[0] = eh1;
        list[1] = eh2;
        list[2] = eh3;
        list[3] = eh4;
        list[4] = eh5;
        list[5] = es1;
        list[6] = es2;
        list[7] = es3;
        list[8] = es4;

        // testing all list output
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
