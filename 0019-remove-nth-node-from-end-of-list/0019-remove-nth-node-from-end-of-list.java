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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next == null){
            return null;
        }
        int index = getLength(head) - n;
        ListNode prev = null;
        ListNode present = head;
        if(index <= 0){
            return head.next;
        }
        while(index>0){
            prev = present;
            present = present.next;
            index--;
        }
        if(present!=null){
             prev.next = present.next;   
        }
        return head;
    }
    public int getLength(ListNode head){
        int ans = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            ans++;
        }
        return ans;
    }
}

