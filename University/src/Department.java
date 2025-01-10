import java.util.Arrays;

public class Department {
    private String depName;
    private String depCode;
    private Professor headOfDepartment;
    private Course[] coursesOffered;

    public Department(String depName, String depCode, Professor headOfDepartment, Course[] coursesOffered) {
        this.depName = depName;
        this.depCode = depCode;
        this.headOfDepartment = headOfDepartment;
        this.coursesOffered = coursesOffered;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public Professor getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Professor headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public Course[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(Course[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    @Override
    public String toString() {
        return
                "depName='" + depName + '\'' +
                        ", depCode='" + depCode + '\'' +
                        ", headOfDepartment=" + headOfDepartment +
                        ", coursesOffered=" + Arrays.toString(coursesOffered) +
                        '}';
    }
}