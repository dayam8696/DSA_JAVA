package Arrays;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(6);
        list.add(72);
        list.add(73);
        list.add(74);
        list.add(75);
        list.add(76);
        list.add(77);
        list.add(78);
        list.add(79);
        list.add(80);

        System.out.println(list.contains(76));
        System.out.println(list);

    }
}
