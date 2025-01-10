public class EmployeeUser {
    public static void main(String[] args) {
        Employee e =new Employee("ali","male","java developer",30,2000);
        System.out.println(e.getEmployee());
        Employee e2=new Employee("adam",500);
        System.out.println(e2.getEmployee());

    }
}
