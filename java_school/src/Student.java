public class Student {
    // class member variables , properties , attributes ,fields
    String name;
    String gender;
    int age;
    String nationality;
    String nativeLanguage;

    String email;
    String phone; // +20154487875
    String address;
    String motherName;
    String fatherName;
    String grade;
    String className;

    // Constructors
    Student(){
        nationality = "Egyptian";
        nativeLanguage ="Arabic";
    }
    Student(String name , String gender ,int age){
        this(); // call the default constructor   Student()
        this.name = name;
        this.gender =gender;
        this.age= age;
    }
    Student(String name , String gender ,int age , String nationality ,String nativeLanguage){
        this(name, gender , age); // call constructor Student(String name , String gender ,int age)
        this.nationality = nationality;
        this.nativeLanguage =nativeLanguage;
    }

    public Student(String name, String gender, int age, String email, String phone, String address, String motherName, String fatherName) {
        this();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }

    // methods

}
