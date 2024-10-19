package Queue;

import java.util.Arrays;

public class QueueMain {
    public static void main(String[] args) {
        // CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.insert(54);
        queue.insert(45);
        queue.insert(78);
        queue.insert(98);
        queue.insert(32);

        queue.display();
        System.out.println(queue.remove());
        queue.display();









    }
}
