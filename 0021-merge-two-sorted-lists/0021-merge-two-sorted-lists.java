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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(a!=null && b!=null){
            if(a.val<b.val){
                t.next=a;
                a=a.next;
            }
            else{
                t.next=b;
                b=b.next;
            }
            t=t.next;
        }
        while(a!=null){
            t.next=a;
            a=a.next;
            t=t.next;
        }
        while(b!=null){
            t.next=b;
            b=b.next;
            t=t.next;
        }
        return d.next;
    }
}