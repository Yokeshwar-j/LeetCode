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
    public ListNode sortList(ListNode h) {
        //merge sort
        int c = len(h);
        if(c<2)return h;
        int a=c/2;
        ListNode pr = h;
        for(int i=1;i<a;i++){
            pr=pr.next;
        }
        ListNode t = pr.next;
        pr.next=null;
        ListNode e = sortList(h);ListNode f = sortList(t);
        return merge(e,f);
    }
    public ListNode merge(ListNode y , ListNode z){
        ListNode fin = new ListNode();
        ListNode prev  = fin;
        while(y!=null && z!=null){
            if(y.val<z.val){
                ListNode cur = new ListNode(y.val);
                prev.next=cur;prev=cur;
                y=y.next;
            }else{
                ListNode cur = new ListNode(z.val);
                prev.next=cur;prev=cur;
                z=z.next;
            }
        }
        if(y!=null){prev.next=y;}
        if(z!=null){prev.next=z;}
        return fin.next;
    }
    public int len(ListNode x){
        int c=0;
        while(x!=null){
            c++;x=x.next;
        }
        return c;
    }
}