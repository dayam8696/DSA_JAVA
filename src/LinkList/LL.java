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
public void insertInBetween(int val , int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
    for (int i = 1; i <index ; i++) {
        temp = temp.next;
    }
    Node node = new Node(val,temp.next);
    temp.next= node;
    size++;
}

public void deleteFirst(){
        int val = head.val;
        head = head.next;
        if (head==null){
            tail= null;

        }
        size--;
    System.out.println(val);
}
    public void deleteLast(){
        int val = tail.val;
        Node temp = head;
        for (int i = 1; i <size-2; i++) {
            temp= temp.next;
        }
        tail = temp.next;
        tail= tail.next = null;
        if (head==null){
            tail= null;

        }
        size--;
        System.out.println(val);
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
