import java.util.HashMap;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Mohammad", "123123");
        map.put("Lara", "456456");

        map.put("Mira", "789789");
        map.remove("Mohammad");
        map.put("Lara", "456456599999");
        System.out.println(map);
        System.out.println(map.get("Lara"));
        Set<String> keys = map.keySet();
        for (String s : keys) {
            System.out.println(s + " : " + map.get(s));
        }
        System.out.println(map.values());


    }
}