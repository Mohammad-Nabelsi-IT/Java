public class Manager extends Person implements Employee {
    private String departmentName;

    public Manager(String departmentName) {
        this.departmentName = departmentName;
    }

    public Manager() {
    }

    public String getDepartmentName() {
        return departmentName;
    }


    @Override
    public double totalSalary() {
        return 5000;
    }

    public Manager(String name, String gender, String departmentName) {
        super(name, gender);
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ndepartmentName = " + departmentName;
    }
}
