import java.util.Scanner;

public class StudentDegreesExample {
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
        // < 50 fail
        // 50 => <65 pass
        // 65 => <75 good
        // 75 => <85 v.good
        // >=85 Excellent

        for (int i = 0; i < degrees.length ; i++) {

            if (degrees[i] < 50) {
                System.out.println(names[i] + " - Fail" );
            } else if (degrees[i] < 65) {
                System.out.println(names[i] + " - Pass" );
            } else if (degrees[i] < 75) {
                System.out.println(names[i] + " - Good" );
            } else if (degrees[i] < 85) {
                System.out.println(names[i] + " - V.Good" );
            }else{
                System.out.println(names[i] + " - Excellent" );
            }

        }

    }
}
