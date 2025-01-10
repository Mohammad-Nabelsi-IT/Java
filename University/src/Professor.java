import java.util.Arrays;

public class Professor extends Person{
   private Course [] courses;

    public Professor(String name, int age, String email, Course[] courses) {
        super(name, age, email);
        this.courses = courses;
    }

    public Professor(String name, int age, String email) {
        super(name, age, email);
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
