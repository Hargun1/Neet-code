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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeCurr = dummy;
        ListNode rightNext = dummy;

        for(int i = 1 ; i < left ; i++ ){
            beforeCurr = beforeCurr.next;
         }
        
        
        ListNode temp = beforeCurr.next;
        ListNode prev = null;
        ListNode curr = beforeCurr.next;
        ListNode next = null;

        for(int i = 0 ; i < right - left + 1 ; i++){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }

        beforeCurr.next = prev;
        temp.next = curr;

        

        return dummy.next;
    }
}