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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        //temp.next=null;
        while(temp!=null){
            int sum=0;
            ListNode curr=temp;
            while(curr.val>0){
                sum+=curr.val;
                curr=curr.next;
            }
            temp.val=sum;
            temp.next=curr.next;
            temp=curr.next;
        }
        // while(t.next!=null){
        //     if(t.val==0){
        //         c++;
        //     }
        //     t=t.next;
        // }
        // int totalcount=c+1;
        //System.out.println(totalcount);
        // while(totalcount!=0){

        //     if(temp.val!=0){
        //         sum+=temp.val;
        //     }
        //     if(temp.val==0){
        //         //int a=sum;
        //         head=head.next;

        //        // temp.val=a;
        //        // temp=temp.next;
        //         totalcount--;
        //         sum=0;
        //     }
        //     temp=temp.next;
        // }
        // return temp;
        return head.next;
    }
}