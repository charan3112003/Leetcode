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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode Previous=head;
        ListNode Current=head.next;
        int first=0;
        int last=0;
        int ind=1;
        int [] ans=new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        while(Current.next!=null){
            if(Current.val<Math.min(Previous.val,Current.next.val)||Current.val>Math.max(Previous.val,Current.next.val)){
                if(last==0){
                    first=ind;
                    last=ind;
                }
                else{
                    ans[0]=Math.min(ans[0],ind-last);
                    ans[1]=ind-first;
                    last=ind;
                }
            }
            ++ind;
            Previous=Current;
            Current=Current.next;
        }

        return first==last?new int[]{-1,-1}:ans;

    }
}