package lessonsWeek3;

public class TestInterfaces {
    public static void main(String[] args) {
        SuperPerson superPerson = new SuperPerson();
        Student student = new Student();
        Worker worker = new Worker();

        University university = new University(superPerson);
        Company company = new Company(superPerson);

        university.toStudy();
        company.toWork();
    }


}

class University {
    public Studyable student;

    public University(Studyable student) {
        this.student = student;
    }

    public void toStudy() {
        student.study();
    }
}

class Company {
    public Workable worker;

    public Company(Workable worker) {
        this.worker = worker;
    }

    public void toWork() {
        worker.work();
    }
}

class Student implements Studyable {

    @Override
    public void study() {
        System.out.println("I'm studying");
    }
}

class Worker implements Workable {

    @Override
    public void work() {
        System.out.println("I'm working");
    }
}

class SuperPerson implements Studyable, Workable {

    @Override
    public void study() {
        System.out.println("I'm working");

    }

    @Override
    public void work() {
        System.out.println("I'm working");
    }
}