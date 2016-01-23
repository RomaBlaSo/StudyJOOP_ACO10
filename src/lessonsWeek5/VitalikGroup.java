package lessonsWeek5;

import java.util.ArrayList;

public class VitalikGroup {

    private ArrayList <Student> students;

    public VitalikGroup() {

        this.students = new ArrayList<>();
        students.add(new Student("Artem", 23, 5));
        students.add(new Student("Kate", 25, 5));
        students.add(new Student("Sergij", 20, 5));
    }

    public ArrayList getStudents() {
        return students;
    }

}
