import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapOne {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(11,"Mohammad");
        map.put(22,"Lara");
        map.put(33,"Mira");
        map.put(44,"Adam");

        Set<Integer> keys= map.keySet();
        for (Integer i : keys){
            System.out.println(i + " : "+map.get(i));
        }
    }
}
