import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Sentence :");

        String sentence = scanner.nextLine();
        String[] w = sentence.split(" ");

        HashSet<String> set = new HashSet<>();
        for (String s : w) set.add(s);
        System.out.println(set);
        System.out.println(set.size());


    }
}
