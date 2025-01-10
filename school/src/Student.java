public class Student {
    String name;
    int age;
    String gender;
    String nationality;
    String grade;
    String className;
    String motherName;
    String fatherName;
    String phone;
    String email;
    String address;
    boolean usingBuss;
    String nativeLanguage;

    Student(){
        this.nationality="German";
        this.nativeLanguage="Deutsch";
    }
    Student(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }
    Student(String name,int age,String gender){
        this();
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public Student(String name, int age, String gender, String grade) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }
    public Student(String name, int age, String gender, String nationality,
                   String grade, String className, String motherName) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.grade = grade;
        this.className = className;
        this.motherName = motherName;
    }
    public Student(String name, int age, String gender, String nationality,
                   String grade, String className, String motherName,
                   String fatherName, String phone, String email, String address,
                   boolean usingBuss) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.grade = grade;
        this.className = className;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.usingBuss = usingBuss;
    }
}
