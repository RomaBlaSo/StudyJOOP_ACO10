package lessons;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(){}

    public Employee(String name, int age, int salary){

        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void doCoffee(){
        System.out.println();
    }

    public String toString(){

        return String.format("My name is %s, i'm %d", name, age);

    }

}
