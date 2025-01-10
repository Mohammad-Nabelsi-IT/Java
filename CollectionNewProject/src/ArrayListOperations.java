import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(2, 25);
        al.remove(3);
        al.set(4,45);
        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println(al.contains(20));
        for (Integer i : al) System.out.println(i);
        System.out.println("Array List Size :" + al.size());

    }
}
