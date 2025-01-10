public class Employee extends Person { // child class

    private double salary;
    private  String jobTitle;

    private  String department;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    // method override "Polymorphism"
    public String getInfo(){
        return  super.getInfo() + // call parent method
                "\nJob \t:"  + this.jobTitle +
                "\nSalary \t:" + this.salary+
                "\nDepartment \t:" + this.department;
    }
}
