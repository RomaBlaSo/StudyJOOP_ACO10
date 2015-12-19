package lessons;

public class Secretary extends Employee {

    int extraMoney;

    public Secretary(String name, int age, int salary, int extraMoney) {
        super(name, age, salary);
        this.extraMoney = extraMoney;
    }

    public void answerPhone() {
        System.out.println("Hello!!");
    }

}