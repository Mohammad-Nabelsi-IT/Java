import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StudentMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> studentMap = new HashMap<>();
        boolean b = true;
        do {
            System.out.println("1. Add Student\n" +
                    "2. Remove Student\n" +
                    "3. Update Student Grade\n" +
                    "4. Display All Students\n" +
                    "5. Find Student Grade\n" +
                    "6. Exit\n");
            try {
                String name = "";
                double g = 0;
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Name : ");
                        name = scanner.next();
                        System.out.println("Grade : ");
                        g = scanner.nextDouble();
                        studentMap.put(name, g);
                        break;

                    case 2:
                        System.out.println("Please Enter Student Name : ");
                        name = scanner.next();
                        studentMap.remove(name);
                        break;

                    case 3:
                        System.out.println("Enter Name : ");
                        name = scanner.next();
                        System.out.println("Enter New Grade : ");
                        g = scanner.nextDouble();
                        studentMap.put(name, g);
                        break;

                    case 4:
                        Set<String> names = studentMap.keySet();
                        for (String k : names) {
                            System.out.println(k + " - " + studentMap.get(k));
                        }
                        break;

                    case 5:
                        System.out.println("Please Enter Student Name : ");
                        name = scanner.next();
                        System.out.println(studentMap.get(name));
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
