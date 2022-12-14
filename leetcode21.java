import java.util.List;

public class leetcode21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode head, temp;

        if (list1.val > list2.val) {
            head = new ListNode(list2.val);
            temp = head;
            list2 = list2.next;
        } else {
            head = new ListNode(list1.val);
            temp = head;
            list1 = list1.next;
        }

        while (true) {
            if (list2 == null) {
                temp.next = list1;
                return head;
            }
            if (list1 == null) {
                temp.next = list2;
                return head;
            }
            if (list1.val > list2.val) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
