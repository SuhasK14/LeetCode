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
    public ListNode oddEvenList(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        
        ListNode oddHead = null;
        ListNode oddTail = null;

        ListNode evenHead = null;
        ListNode evenTail = null;
        
        ListNode temp = head;
        int counter = 1;
        while (temp != null)
        {
            if (counter % 2 == 0) // check if even
            {
                if (evenHead == null)
                {
                    evenHead = temp;
                    evenTail = temp;
                }
                else
                {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            }
            else
            {
                if (oddHead == null)
                {
                    oddHead = temp;
                    oddTail = temp;
                }
                else
                {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
            counter++;
        }
        
        // Combine odd and even lists
        if (oddHead == null)
        {
            return evenHead;
        }
        else if (evenHead == null)
        {
            return oddHead;
        }
        else
        {
            oddTail.next = evenHead;
            evenTail.next = null; // terminate list
            return oddHead;
        }
    }
}
