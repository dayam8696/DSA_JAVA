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

    public void deleteInBetween(int index){
        if (index==0){
            deleteFirst();
            return;
        }
        if (index==size){
            deleteLast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
       temp.next = temp.next.next;
        size--;
        System.out.println("END");


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
 public void removeDuplicates(){
        Node node = head;
        while (node.next!=null){
            if (node.val==node.next.val){
                node.next = node.next.next;
                size--;
            }
            else {
                node= node.next;
            }
        }
        tail=node;
        tail.next=null;
 }
// Question 21 (LeetCode) Merge two linklist
    public static LL merge (LL first , LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

      while (f != null && s != null){
          if (f.val < s.val){
              ans.insertLast(f.val);
              f= f.next;
          }else {
              ans.insertLast(s.val);
              s= s.next;
          }
      }
      while (f !=null){
          ans.insertLast(f.val);
          f = f.next;
      }
        while (s !=null){
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

    // question 141 detecting cycle in linklist

    public static void main(String[] args) {
 //      LL list = new LL();
//        list.insertLast(10);
//        list.insertLast(10);
//        list.insertLast(20);
//        list.insertLast(20);
//        list.insertLast(40);
//        list.insertLast(50);
//        list.display();
//        list.removeDuplicates();
//        list.display();
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);

       LL ans = LL.merge(first,second);
       ans.display();
    }


}
