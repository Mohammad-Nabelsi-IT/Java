public class MainUsingEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name ="Ahmed";
        e1.age =32;
        e1.department ="Developing";
        e1.jobTitle = "Full Stack Developer";

        System.out.println(e1.getEmployeeInfo());

        Employee e2 = new Employee("Heba" , 20 ,"Female");

        System.out.println(e2.getEmployeeInfo());

        System.out.println("--------------");

        Employee e3 = new Employee("Islam" , 25 , "Male" ,"Testing" ,"Software Tester" ,20000);
        System.out.println(e3.getEmployeeInfo());

        Employee e4 = new Employee("Mohamed" ,32 , "Testing" ,"Tester");
        System.out.println(e4.getEmployeeInfo());

    }
}
