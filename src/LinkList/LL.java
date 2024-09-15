package LinkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head =node;

        if (tail==null) {
            tail =head;
        }
        size ++;
}
public void insertLast(int val ){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;


}
public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.printf(temp.val + "->");
            temp= temp.next;
        }
    System.out.println("END");

}
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
