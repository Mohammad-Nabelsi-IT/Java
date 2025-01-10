public class Employee {

    String name;
    String gender;
    String jobTitle;
    String nationality;
    int age;
    int salary;

    Employee() {
        this.nationality = "syrian";
        this.salary = 5000;
    }

    Employee(String name, int salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, String gender, String jobTitle, int age, int salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }

    String getEmployee() {
        return
                "name: " + name + "\ngender: " + gender +
                        "\njob title: " + jobTitle + "\nage: " + age +
                        "\nsalary: " + salary+"\nnationality: "+nationality;
    }

}
