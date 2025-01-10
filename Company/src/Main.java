import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setName("Ali");
        System.out.println(e.getName());
        e.setGender("Male");
        System.out.println(e.getGender());
        //e.setBirthday(10.11.1990);
        //System.out.println(e.getBirthday());
        e.setJob("JAVA Developer");
        System.out.println(e.getJob());
        e.setSalary(1500);
        System.out.println(e.getSalary());
        Employee e1=new Employee();
        e1.setName("Adam");
        e1.setGender("Male");
        e1.setBirthday(new Date (90,10,10));
        e1.setJob("JAVA Developer");
        e1.setSalary(2000);
        System.out.println(e1.getInfo());
        System.out.println("=============================================");
        Employee ee [] = {e,e1};
        Company c =new Company("Mohammad", ee);
        c.allSalaries();

    }
}
