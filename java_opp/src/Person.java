public class Person {
    String name;
    int age ;
    String gender ;

    Person(){
        System.out.println("Person Created");
    }
    // overloads

    Person(String name ,int age , String gender){
        // this.name  //  name member variable
        this.name = name; // change the name value
        this.age =age;
        this.gender =gender;
    }

    String getId(){
        return  "My Name is : " + name + " I am " + gender+ "  I have " + age + " years old ";
    }
}
