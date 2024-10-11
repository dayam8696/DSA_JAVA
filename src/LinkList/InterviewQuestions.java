package LinkList;

public class InterviewQuestions {
    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

//leet code question - https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        if(f!=null && f.next!=null){
            s = s.next;
            f = f.next;
        }
        return s;
    }

    // https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==right){
            return head;
        }
        // skip the left -1 node
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left-1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;

    }
}
