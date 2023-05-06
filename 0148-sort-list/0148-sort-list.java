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
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode m = mid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(m);
        return merge(left,right);
    }
    private ListNode merge(ListNode x, ListNode y) {
    ListNode i = x;
    ListNode j = y;
    ListNode result = new ListNode(); // Remove the default constructor usage
    ListNode res = result;
    
    while (i != null && j != null) {
        if (i.val < j.val) {
            res.next = i; // Assign the current node directly
            i = i.next;
        } else {
            res.next = j; // Assign the current node directly
            j = j.next;
        }
        
        res = res.next;
    }
    
    // Connect the remaining nodes
    if (i != null) {
        res.next = i;
    } else if (j != null) {
        res.next = j;
    }
    
    return result.next;
}

    private ListNode mid(ListNode head){
        ListNode s =null;
        while(head!=null && head.next!=null){
            s = (s==null)? head:s.next;
            head=head.next.next;
        }
        ListNode ans = s.next;
        s.next = null;
        return ans;
    }
}