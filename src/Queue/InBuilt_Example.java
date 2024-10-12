package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuilt_Example {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();


        queue.add(15);
        queue.add(6);
        queue.add(56);
        queue.add(78);
        queue.add(35);
        queue.add(80);
        System.out.println(queue.peek());
    }


}
