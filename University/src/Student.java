public class Student extends Person{
    private String studentId;
    public Student(String name, int age, String email) {
        super(name, age, email);
    }

    public Student(String name, int age, String email, String studentId) {
        super(name, age, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nstudentId = " + studentId;
    }
}
