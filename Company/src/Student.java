public class Student extends Person{
    private String course ;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getInfo(){
        return super.getInfo()+
                "\nCourse : "+this.course;
    }
}
