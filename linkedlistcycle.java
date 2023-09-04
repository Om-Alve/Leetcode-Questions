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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode s = head;
        ListNode f = head;
        while(s.next!=null){
            s = s.next;
            if (f!=null && f.next!= null){
                f = f.next.next;  
            }
            else{
                break;
            }
            if(s==f){
                return true;
            }
        }
        return false;
    }
}
