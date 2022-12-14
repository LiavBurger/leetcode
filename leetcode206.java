import java.util.HashMap;

public class leetcode206 {

    public ListNode reverseList(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        int i=1;
        while (head.next != null) {
            map.put(i, head);
            head = head.next;
            i++;
        }
        head = new ListNode(map.get(i).val);
        ListNode temp = head;
        for (int j = i-1; j > 0; j++) {
            temp.next = new ListNode(map.get(j).val);
        }
        return head;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
