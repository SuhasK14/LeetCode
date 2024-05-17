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
class Solution
{
    public ListNode reverseList(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null)
        {
            // store next variable
            ListNode next = current.next;
            // reverse direction of arrow of current.next to point to previous
            current.next = prev;
            // Move forward
            prev = current;
            current = next;
        }

        // return prev, as it starts at the end and goes backwards since all the arrows have been reversed
        return prev;
    }
}
