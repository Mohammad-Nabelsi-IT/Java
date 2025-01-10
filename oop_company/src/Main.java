public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Doaa");
        e.setGender("Female");
        e.setEmail("dode3us@yahoo.com");
        e.setPhone("01225738514");
        e.setAddress("Alex, Egypt");
        e.setJobTitle("Instructor");
        e.setSalary(5000);
        e.setDepartment("Training");
        System.out.println(e.getInfo());

        System.out.println("-----------------");

        Manager m = new Manager();
        m.setName("Ahmed");
        m.setGender("Male");
        m.setEmail("ahmed@gmail.com");
        m.setSalary(14000);
        m.setBonus(1000);
        m.setPhone("080480480");
        m.setAddress("Cairo Eg");
        System.out.println(m.getInfo());

        System.out.println("-----------------");

        Student s = new Student();
        s.setName("Mai");
        s.setGender("Female");
        s.setCourse("JAVA");
        System.out.println(s.getInfo());

    }
}
