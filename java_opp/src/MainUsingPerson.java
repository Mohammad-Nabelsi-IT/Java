public class MainUsingPerson {
    public static void main(String[] args) {

        Person p = new Person(); // object using default constructor
        p.name = "Ahmed";
        p.age  = 10 ;
        p.gender = "Male";

        System.out.println(  p.getId());

        Person p2 = new Person("Doaa" ,42,"Female");
        System.out.println(p2.getId());

        Person p3 = new Person("Sara" , 12 , "Female");


    }
}
