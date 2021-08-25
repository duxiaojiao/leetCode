package q141_环形链表.s1_快慢指针;


import q141_环形链表.s1_快慢指针.ListNode;

/**
 * 慢指针移动一步，快指针移动两步
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast ==null|| fast.next==null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
