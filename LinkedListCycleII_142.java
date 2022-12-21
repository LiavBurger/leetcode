import java.util.LinkedHashSet;

public class LinkedListCycleII_142 {
    public ListNode detectCycle(ListNode head) {
        LinkedHashSet <ListNode> al = new LinkedHashSet<ListNode>();
        while(head != null) {
            if (!al.contains(head))
                al.add(head);
            else
                return head;

            head = head.next;
        }
        return null;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
