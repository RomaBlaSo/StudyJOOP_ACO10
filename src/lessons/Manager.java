package lessons;

import java.util.ArrayList;

public class Manager extends Employee {

    private Secretary secretary;

    ArrayList<Employee> employees = new ArrayList();

    public Manager() {
    }

    public Manager(String name, int age, int salary, Secretary secretary) {
        super(name, age, salary);
        this.secretary = secretary;
    }

    public void addWorker(Employee employee) {

        employees.add(employee);
        System.out.println("You've hired " + employee.getClass());

    }

    public void deleteWorker(Employee employee) {
        employees.remove(employee);
        System.out.println("You've fired employee");

    }

    public void showPersonal() {

        for (Employee ee : employees) {

            System.out.println("" + ee.getClass() + " " + ee);
            if (ee instanceof Coder)
            {((Coder) ee).writeCode();}
        }

    }

    public void countMoney() {
        System.out.println("I'm count money");
    }

    public void makeWorkProcess() {

    }

}