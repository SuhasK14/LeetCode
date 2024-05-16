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
    public ListNode deleteMiddle(ListNode head)
    {
        int length = findLength(head);
        
        // If the length is less than or equal to 1, there's no middle node to delete
        if (length <= 1)
        {
            return null;
        }
        
        // temp is set to head object; Changes made here will reflect in head too
        ListNode temp = head;
        int middle = length / 2;

        // loop through list until you get to the node right before the middle node
        int counter = 0;
        while (true)
        {
            if (counter < middle - 1)
            {
                // loop
                temp = temp.next;
            }
            else
            {
                // skip next node
                temp.next = temp.next.next;
                break;
            }
            counter++;
        }
        // return first node in the linked list
        return head;
    }
    public int findLength(ListNode head)
    {
        int length = 0;
        while (head != null)
        {
            length++;
            head = head.next;
        }
        return length;
    }
}
