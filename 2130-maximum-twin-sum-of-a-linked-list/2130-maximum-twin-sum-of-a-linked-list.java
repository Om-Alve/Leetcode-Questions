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
    public int pairSum(ListNode head) {
        ListNode s = head;
        ListNode mid = getMid(head);
        ListNode e = reverse(mid);
        mid.next = null;
        int ans = 0;
        while(s!=null && e!=null){
            if(s.val+e.val > ans){
                ans = s.val+e.val;
            }
            s = s.next;
            e = e.next;
        }
        return ans;
    }
    public ListNode getMid(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present  = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
}