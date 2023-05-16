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
    public ListNode swapNodes(ListNode head, int k) {
        int l = getLength(head);
        int endIndex = l - k;
        ListNode s = head;
        ListNode e = head;
        for(int i=1;i<k;i++){
            s=s.next;
        }
        for(int i=1;i<l-k+1;i++){
            e = e.next;
        }
        int temp = s.val;
        s.val = e.val;
        e.val = temp;
        return head;
        
    }
    private int getLength(ListNode head){
        ListNode temp = head;
        int l = 0;
        while(temp!=null){
            temp = temp.next;
            l++;
        }
        return l;
    }
}