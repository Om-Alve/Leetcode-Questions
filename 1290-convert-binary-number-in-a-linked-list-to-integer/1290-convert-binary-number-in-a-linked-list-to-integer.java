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
    public int getDecimalValue(ListNode head) {
        head = rev(head);
        int ans=0;
        int factor=1;
        while(head!=null){
            ans += head.val * factor;
            head=head.next;
            factor *=2;
        }
        return ans;
    }
    public ListNode rev(ListNode head){
        if(head==null && head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
}
