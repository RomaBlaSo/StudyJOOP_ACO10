package lessonsWeek5;

public class SergijGroup {

    private Student[] students;

    public SergijGroup() {

        this.students = new Student[3];
        students[0] = new Student("Artem", 23, 5);
        students[1] = new Student("Kate", 25, 5);
        students[2] = new Student("Sergij", 20, 5);
    }

    public Student[] getStudents() {
        return students;
    }

}
