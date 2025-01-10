public abstract class Employee extends Person{
    private double salary;
    private String job;

    public Employee() {
        System.out.println("Employee create");
    }

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
    public abstract double totalSalary();
}
