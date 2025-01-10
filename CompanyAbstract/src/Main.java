public class Main {
    public static void main(String[] args) {
        Coach c =new Coach();
        c.setName("Jad");
        c.setGender("Male");
        c.setJob("Tennis");
        c.setHour(40);
        c.setHourPrice(15);
        c.setSalary(1000);
        System.out.println(c.totalSalary());
        System.out.println("--------------------");

        SalesEmployee s =new SalesEmployee();
        s.setName("Sara");
        s.setGender("Female");
        s.setJob("Driver");
        s.setSalary(2000);
        s.setCommission(0.1);
        s.setCollectionAmount(10000);
        s.setTarget(9000);
        System.out.println(s.totalSalary());
        System.out.println("--------------");




    }
}
