import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter List Numbers :");
        int c = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            list.add(scanner.next());
        }
        System.out.println(list);

        HashSet<String> set =new HashSet<>(list);
        System.out.println(set);
    }
}
