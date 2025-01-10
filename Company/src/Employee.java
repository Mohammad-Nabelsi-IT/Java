public class Employee extends Person {
    private double salary;
    private String job;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getInfo(){
        return super.getInfo()+
                "\nJob : "+this.job+
                "\nSalary : "+this.salary;
    }
}
