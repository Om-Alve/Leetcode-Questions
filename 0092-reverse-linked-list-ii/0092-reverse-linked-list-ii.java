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
        if (left == right) {
            return head;
        }
        
        ListNode prev = null;
        ListNode present = head;
        
        // Step 1: Traverse to the node at position 'left'
        for (int i = 0; i < left - 1 && present != null; i++) {
            prev = present;
            present = present.next;
        }
        
        ListNode nxt = present.next;
        ListNode last = prev;
        ListNode newEnd = present;
        
        // Step 2: Reverse the nodes from 'left' to 'right'
        for (int i = 0; i < right - left + 1; i++) {
            present.next = prev;
            prev = present;
            present = nxt;
            
            if (nxt != null) {
                nxt = nxt.next;
            }
        }
        
        // Step 3: Connect the reversed portion back to the original list
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        
        newEnd.next = present;
        
        return head;
    }
}