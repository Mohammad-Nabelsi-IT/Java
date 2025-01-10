public class Main {
    public static void main(String[] args) {
        Coach c =new Coach("Adam","Male",50,30);
        Manager m =new Manager("Mohammad","Male","HR");
        print(c);
        System.out.println("===========");
        print(m);
    }
    static void print(Employee e ){
        System.out.println(e.totalSalary());
        System.out.println(e);
    }
}
