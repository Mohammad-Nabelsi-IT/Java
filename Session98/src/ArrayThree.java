import java.util.Locale;
import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String word = scanner.next();
        char m[]=word.toCharArray();
        for (char c : m)
        System.out.println(c);
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
    }
}
