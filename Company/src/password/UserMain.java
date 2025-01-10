package password;

public class UserMain {
    public static void main(String[] args) {
        User u = new User("swmb", "123", "kj@gmail.com");
        if (u.chengPassword("123", "465")) {
            System.out.println("Done");
        }else {
            System.out.println("Invalid Password");
        }
        Customer c=new Customer("Mohammad","132","lkjjh@gmail.com");
        if (c.chengPassword("122","456")){
            System.out.println("Done");
        }else {
            System.out.println("Invalid Password");
        }


    }
}
