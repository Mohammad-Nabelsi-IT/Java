import java.util.Date;

public class Person {
    private String name;
    private String gender;
    private Date birthday;

    public Person() {
        System.out.println("create person");
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getInfo(){
        return "Name : "+this.name+
                "\nGender : "+this.gender+
                "\nBirth Date : "+this.birthday;
    }
}
