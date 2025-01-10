import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            declare scanner
            read inputs from user name , age , gender
            create Student object
         */
        Scanner scanner = new Scanner(System.in);
        Student [] students = new Student[3];
        for (int i = 0; i <students.length ; i++) {
            System.out.print("Name : ");
            String n = scanner.next();

            System.out.print("Age :");
            int age = scanner.nextInt();

            System.out.print("Gender : ");
            String gender = scanner.next();

            Student s1 = new Student(n , gender , age); // student object
            students[i] = s1;

            System.out.print("Mother Name : ");
            s1.motherName = scanner.next();
            System.out.print("Father Name : ");
            s1.fatherName =scanner.next();
        }

        // list all school students

        for(Student s :students){
            System.out.println(s.name);
            System.out.println(s.age);
        }

    }
}
