import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
//        Student s =new Student();
//
//        Student s2=new Student("ali",30);
//        Student s3=new Student("fares",12,"Male","4");
//        Student s4=new Student("adam",15);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("enter your name: ");
            String name = scanner.next();

            System.out.print("enter your age: ");
            int age = scanner.nextInt();

            System.out.print("enter your gender: ");
            String gender = scanner.next();

            Student s1 = new Student(name, age, gender);
        } while (true);
    }
}

