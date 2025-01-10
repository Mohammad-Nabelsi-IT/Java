package password;

public class User {
    private String userName;
    private String password;
    public String email;

    public String getUserName() {
        return userName;
    }

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
    public boolean chengPassword(String currentPassword,String newPassword){
        if (this.password.equals(currentPassword)) {
            this.password=newPassword;
            return true;
        }else return false;
    }
}
