import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter students count : ");
        int c = scanner.nextInt();

        ArrayList<Student1> list = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            System.out.print("Name : ");
            String name = scanner.next();

            System.out.print("Grade : ");
            int g = scanner.nextInt();
            list.add(new Student1(name, g));
        }

        for (Student1 s : list) {
            System.out.println(s.getName() + " - " + s.getGrade());
        }


    }
}


class Student1 {
    private String name;
    private double grade;

    public Student1(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student : " +
                " name='" + name +
                ", grade=" + grade + "\n";
    }

}

