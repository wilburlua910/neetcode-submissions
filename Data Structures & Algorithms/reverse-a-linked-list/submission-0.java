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
    public ListNode reverseList(ListNode head) {

        return swap(head, null);

        
    }

    public ListNode swap(ListNode curr, ListNode prev) {

        if (curr == null) {
            return prev;
        }

        ListNode temp = curr.next;

        curr.next = prev;
        return swap(temp, curr);






    }
    
}
