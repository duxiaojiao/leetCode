package q141_环形链表.s2_哈希;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
