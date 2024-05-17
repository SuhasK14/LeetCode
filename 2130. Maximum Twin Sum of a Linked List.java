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
    public int pairSum(ListNode head)
    {
        // get current to start at second half of list
        ListNode current = head;
        int length = findLength(head);
        for (int i = 0; i < length / 2; i++)
        {
            current = current.next;
        }

        // reverse second half of list
        ListNode prev = null;
        while (current != null)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // using prev as head of second half and head as head of first half, we traverse the list.
        // We take the sum of both the values to find the largest sum.
        // This loop will run until the end of the first/second half or length/2
        int sum = 0;
        for (int i = 0; i < length / 2; i++)
        {
            sum = Math.max(head.val + prev.val, sum);
            head = head.next;
            prev = prev.next;
        }
        return sum;
    }
    // find length of the list
    public int findLength(ListNode head)
    {
        ListNode current = head;
        int length = 0;
        while (current != null)
        {
            length++;
            current = current.next;
        }
        return length;
    }
}
