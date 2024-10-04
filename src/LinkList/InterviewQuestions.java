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
}
