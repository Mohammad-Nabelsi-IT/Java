import java.util.Arrays;

public class Course {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private Student[] studentEnrolled;
public Course (){
    studentEnrolled=new Student[10];
}
    public Course(String courseCode, String courseName, Professor professor, Student[] studentEnrolled) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.professor = professor;
        this.studentEnrolled = studentEnrolled;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudentEnrolled() {
        return studentEnrolled;
    }

    public void setStudentEnrolled(Student[] studentEnrolled) {
        this.studentEnrolled = studentEnrolled;
    }
public void addStudent(Student student){
    for (int i = 0; i <studentEnrolled.length ; i++) {
        if (studentEnrolled[i]==null){
            studentEnrolled[i]=student;
            break;
        }
        
    }
}
public void removeStudent(String studentId){
    for (int i = 0; i <studentEnrolled.length ; i++) {
        if (studentEnrolled[i].getStudentId().equals(studentId) ){
            studentEnrolled[i]=null;
            break;
        }
    }

}
    @Override
    public String toString() {
        return
                "courseCode='" + courseCode +
                ", courseName='" + courseName +
                ", professor=" + professor +
                ", studentEnrolled=" + Arrays.toString(studentEnrolled) +
                '}';
    }
}

