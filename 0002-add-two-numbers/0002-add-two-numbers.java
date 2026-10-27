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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1,t2=l2;
        int s=0,c=0;
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(t1!=null || t2!=null){
            int a=t1==null ? 0:t1.val;
            int b=t2==null ? 0:t2.val;
            s=a+b+c;
            c=s/10;
            ListNode nn=new ListNode(s%10);
            t.next=nn;
            t=nn;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
        }
        if(c>0) {
            ListNode nn=new ListNode(c);
            t.next=nn;
        }
        return d.next;
    }
}