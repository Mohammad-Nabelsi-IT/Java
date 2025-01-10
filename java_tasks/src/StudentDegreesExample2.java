import java.util.Scanner;

public class StudentDegreesExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student Count : ");
        int studentsCount = scanner.nextInt();

        String names [] = new String[studentsCount];
        double degrees [] = new double[studentsCount];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Student Name : ");
            names[i] = scanner.next();

            System.out.print("Student Degree : ");
            degrees[i] = scanner.nextDouble();
        }

        for (int i = 0; i < degrees.length ; i++) {
//            System.out.println(names[i] + " " + getGrade(degrees[i]));
            System.out.println(names[i]);
            System.out.println(getGrade(degrees[i]));
        }

    }

    static  String getGrade(double d){
        if (d < 50) {
            return  "Fail";
        } else if (d < 65) {
            return "Pass" ;
        } else if (d < 75) {
            return  "Good";
        } else if (d < 85) {
            return "V.Good";
        }else{
            return "Excellent";
        }
    }
}
