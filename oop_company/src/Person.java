import java.util.Date;

public class Person { // parent class , super class , base class

    private  String name;
    private  String gender;
    private Date birthdate;

    private String address;
    private String email;
    private String phone;

    public Person() {
        System.out.println("Person Created");
    }

    public Person(String name, String gender, Date birthdate) {
        this();
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public Person(String name, String gender, Date birthdate, String address, String email, String phone) {
        this(name ,gender ,birthdate);
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getInfo(){
        return  "Name \t:"  + name +
                "\nGender \t:" + this.gender+
                "\nBirthDate \t:" + this.birthdate+
                "\nEmail \t:" + this.email+
                "\nPhone \t:" + this.phone+
                "\nAddress \t:" + this.address;
    }
}
