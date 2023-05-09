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
    public void reorderList(ListNode head) {
        if(head ==null || head.next==null){
            return;
        }
        ListNode mid = getMid(head);
        ListNode firstHead = head;
        ListNode secondHead = rev(mid);
        while(secondHead!=null && firstHead!=null){
            ListNode temp =  firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;
            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }
        if(firstHead!=null){
            firstHead.next = null;
        }
        return;
        
    }
    public ListNode rev(ListNode head){
        if(head ==null || head.next==null){
            return null;
        }
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
    public ListNode getMid(ListNode head){
        if(head ==null || head.next==null){
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        while(f.next != null && f.next.next != null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
}