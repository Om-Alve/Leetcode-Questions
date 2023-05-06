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
    public ListNode detectCycle(ListNode head) {
        int length = cycleLength(head);
        ListNode i=head;
        ListNode j=head;
        if(length==0){
            return null;
        }
        while(length>0){
            j=j.next;
            length--;
        }
        while(i!=j){
            i=i.next;
            j=j.next;
        }
        return i;
    }
    public int cycleLength(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                ListNode temp = slow.next;
                length++;
                while(temp!=slow){
                    temp=temp.next;
                    length++;
                }
                return length;
            }
        }
        return 0;
    }
}