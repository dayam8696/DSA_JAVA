package LinkList;

public class LinkList {
    public NodeStructure head;
    public NodeStructure tail;

    public int size = 0;

    public void addFirst(int data) {
        size ++;
        NodeStructure newNode = new NodeStructure(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }


}


