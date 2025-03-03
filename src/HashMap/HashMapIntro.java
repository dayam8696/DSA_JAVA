package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Dayam" ,89);
        map.put("Ans" ,87);
        map.put("Abuzar" ,85);
        System.out.println(map.get("Dayam"));
        System.out.println(map.getOrDefault("Alok" , 99));
        System.out.println(map.containsKey("Dayam"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(7);
        System.out.println(set);
    }

}
