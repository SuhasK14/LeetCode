/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // initial null check before setting slow and fast node variables
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        // traverse through linked list unless there is a null pointer exception (can't call .next on a null node)
        while (fast != null && fast.next != null) {
            // if nodes are equal to each other (checks by reference), then there is a loop and return true
            if (slow == fast) {
                return true;
            }
            // move slow by one node and fast by two nodes
            slow = slow.next;
            fast = fast.next.next;
        }
        // if outside loop, then return false (condition failed to be met)
        return false;
    }
}
