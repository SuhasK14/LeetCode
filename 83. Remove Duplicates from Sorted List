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
    public ListNode deleteDuplicates(ListNode head) {
        // set tail to iterate through
        ListNode tail = head;
        // check that both values to be compared are not null to avoid error when .val is called
        while (tail != null && tail.next != null) {
            // if next node val is equal then skip to one after
            if (tail.val == tail.next.val) {
                tail.next = tail.next.next;
                // we do not iterate, as we need to compare current node val again with new next node val
            }
            // if vals are not equal, then iterate to next node
            else {
                tail = tail.next;
            }
        }
        // return original head with now deleted duplicates list
        return head;
    }
}
