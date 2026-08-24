/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        return tracker(head, new HashSet<ListNode>());


        
    }

    public boolean tracker(ListNode head, Set<ListNode> set) {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            return false;
        } else if (set.contains(head)) {
            return true;
        } else {
            set.add(head);
            return tracker(head.next, set);
        }
    }
}
