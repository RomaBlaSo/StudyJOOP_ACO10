package lessons;

public class Company {

    Employee[] employees;
    Manager[] managers;
    Secretary[] secretaries;

    public static void main(String[] args) {

        Secretary secretary = new Secretary("Natasha", 20, 500, 2000);
        Manager manager = new Manager("Mike", 35, 1200, secretary);
        Coder coder = new Coder();
        Coder coder2 = new Coder();
        Coder coder3 = new Coder();
        SysAdmin sysAdmin = new SysAdmin();
        SysAdmin sysAdmin2 = new SysAdmin();
        SysAdmin sysAdmin3 = new SysAdmin();

        manager.addWorker(coder);
        manager.addWorker(coder2);
        manager.addWorker(coder3);

        manager.addWorker(sysAdmin);
        manager.addWorker(sysAdmin2);
        manager.addWorker(sysAdmin3);

        manager.showPersonal();

    }
}