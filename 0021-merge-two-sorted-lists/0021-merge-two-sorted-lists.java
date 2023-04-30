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
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        ListNode f = list1;
        ListNode s = list2;
        while(f != null && s !=null){
            if(f.val<=s.val){
                if(ans == null){
                    ans.val = f.val;
                }
                else{
                    ans.next = new ListNode(f.val);
                    ans = ans.next;
                }
                f = f.next;
            }
            else{
                if(ans == null){
                    ans.val = s.val; 
                }
                else{
                    ans.next = new ListNode(s.val);
                    ans = ans.next;
                }
                s = s.next;
            }
        }
        while(f!=null){
            ans.next = new ListNode(f.val);
            ans = ans.next;
            f = f.next;
        }
        while(s!=null){
            ans.next = new ListNode(s.val);
            ans = ans.next;
            s = s.next;
        }
        return ansHead.next;
    }
}