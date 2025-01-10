import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookMapApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student1> list = new ArrayList<>();
        boolean b = true;
        do {
            System.out.println("1. Add student\n" +
                    "2. Remove student\n" +
                    "3. Update student grade\n" +
                    "4. Display all students\n" +
                    "5. Find student grade\n" +
                    "6. Exit");

            try {

                String name = "";
                double g = 0;
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Name :");
                        name = scanner.next();
                        System.out.println("Grade :");
                        g = scanner.nextDouble();
                        list.add(new Student1(name, g));
                        break;

                    case 2:
                        System.out.println("Please Enter Student index start with 1 to  " + (list.size()) + " : ");
                        int x = scanner.nextInt();
                        if (x <= list.size()) list.remove(x - 1);
                        else System.out.println("Not Found student at " + x);
                        break;
                    case 3:
                        System.out.println("Enter Name :");
                        name = scanner.next();
                        System.out.println("Add New Student Grade :");
                        g = scanner.nextDouble();
                        for (int i = 0; i < list.size() ; i++) {
                            if (list.get(i).getName().equals(name)){
                                list.get(i).setGrade(g);
                            }
                        }

                        break;

                    case 4:
                        for (Student1 s : list) {
                            System.out.println(s);
                        }
                        break;

                    case 5:
                        System.out.println("Please Enter Student Name : ");
                        name = scanner.next();
                        for (Student1 s : list) {
                            if (s.getName().equals(name))
                             System.out.println("Student " + name + " Found and Grade = " + s.getGrade());

                        }
                        break;


                    case 6:
                        System.out.println("Good Bye");
                        b = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entry Error Please Try Again : " + e.getMessage());
                scanner.next();

            }


        } while (b);


    }
}

