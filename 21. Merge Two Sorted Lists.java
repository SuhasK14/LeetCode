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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // head and tail(moves with the loop) of new sortedList
        ListNode sortedList = new ListNode(0);
        ListNode current = sortedList;
        // loop through comparing the values of both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // point to next node on list
                current.next = list1;
                // move values to next node
                current = current.next;
                list1 = list1.next;
            } else {
                // point to next node on list
                current.next = list2;
                // move values to next node
                current = current.next;
                list2 = list2.next;
            }
        }
        // check edge cases if either list still has remaining values after loop
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        // return the next value of sortedList, as the head is a dummy value 
        return sortedList.next;
    }
}
