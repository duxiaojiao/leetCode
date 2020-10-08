package q206_反转链表.s1_迭代;

public class Solution {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l4.next = new ListNode(5);
        l3.next = l4;
        l2.next = l3;
        l1.next = l2;

        System.out.println(l1);
        ListNode listNode = reverseList(l1);
        System.out.println(listNode);

    }
}
