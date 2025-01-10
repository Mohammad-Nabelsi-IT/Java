public class Employee {
    // properties , class member variables , attributes
    String name;
    double age ;
    String jobTitle ;
    String gender;
    String nationality;
    String department;
    double salary;

    Employee(){
        System.out.println("Employee Created");
        salary = 15000;
        nationality ="Egyptian";
        gender = "Male" ;
    }

    Employee (String name  , double age ,String gender ){
        this(); // call the Employee() constructor
        this.name =name;
        this.age= age;
        this.gender= gender;
    }

    Employee (String name  , double age ,String gender  , String department , String jobTitle )
    {
        this(name , age ,gender); // call  Employee (String name  , double age ,String gender )
        this.department = department;
        this.jobTitle = jobTitle;
    }
    Employee (String name  , double age ,String gender  , String department , String jobTitle , double salary)
    {
        this(name , age ,gender); // call  Employee (String name  , double age ,String gender )
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary =salary;

    }
    Employee (String name  , double age   , String department , String jobTitle )
    {
        this(name , age ,"Male"); // call  Employee (String name  , double age ,String gender )
        this.department = department;
        this.jobTitle = jobTitle;
    }
    String getEmployeeInfo(){
        return "Name \t: " + name  +
                "\nGender : \t" + gender +
                "\nAge \t:" + age +
                "\nNationality \t:" + nationality +
                "\nDepartment \t:" + department +
                "\nJob Title \t:" + jobTitle +
                "\nSalary \t:" + salary ;
    }

}
