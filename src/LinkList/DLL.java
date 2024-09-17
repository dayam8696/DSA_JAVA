package LinkList;

public class DLL {

    private Node head;
//    private Node tail;
  //  private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;

        }
        head = node;

    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head==null){
            head.prev = null;
            head = node;
            return;
        }
        while (last.next!=null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }


    public void display(){
        Node node = head;
        Node last = null;

        while (node!=null){
            last = node;
            System.out.printf(node.val + " ->");
            node=node.next;
        }
        System.out.println("END");
        System.out.println("Print in Reverse");
        while (last!= null){
            System.out.printf(last.val + "->");
            last=last.prev;
        }
        System.out.println("Start");
    }
   private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
