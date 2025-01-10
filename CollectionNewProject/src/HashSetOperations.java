import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("date");
        hashSet.add("elderberry");
        hashSet.remove("date");
        System.out.println(hashSet.contains("banana"));
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        for (String s : hashSet)
            System.out.println(s);
    }
}
